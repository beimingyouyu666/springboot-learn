package com.yangk.springbootmutildatasource.config;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

import java.util.List;

/**
 * @Description 编码实现接口切面拦截
 * @Author yangkun
 * @Date 2020/7/29
 * @Version 1.0
 * @blame yangkun
 */
@Slf4j
@Aspect
@Order(1)
public class DataSourceAspect {

    /**
     * 切面启动时设置数据源从库列表名称
     * @param slaves
     */
    public DataSourceAspect(List<String> slaves){
        DSContextHolder.setSlaves(slaves);
    }

    @Pointcut("@annotation(com.yangk.springbootmutildatasource.config.Master) && execution(* com.yangk.springbootmutildatasource.service.impl.*.*(..))")
    public void readPointcut() { }

    @Pointcut("@annotation(com.yangk.springbootmutildatasource.config.Slave) && execution(* com.yangk.springbootmutildatasource.service.impl.*.*(..))")
    public void writePointcut() { }

    @Before("readPointcut()")
    public void readBefore(JoinPoint joinPoint) {
        DSContextHolder.slave();
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        log.debug("{}.{} USE DATASOURCE SLAVE", className, methodName);
    }

    @After("readPointcut()")
    public void readAfter(JoinPoint joinPoint) {
        DSContextHolder.master();
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        log.debug("{}.{} RESET DATASOURCE MASTER", className, methodName);
    }

    @Before("writePointcut()")
    public void writeBefore(JoinPoint joinPoint) {
        DSContextHolder.master();
        String className = joinPoint.getTarget().getClass().getName();
        String methodName = joinPoint.getSignature().getName();
        log.debug("{}.{} USE DATASOURCE MASTER", className, methodName);
    }

}
