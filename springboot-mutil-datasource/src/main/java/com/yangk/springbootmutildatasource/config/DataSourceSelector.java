package com.yangk.springbootmutildatasource.config;

import java.lang.annotation.*;

/**
 * @Description TODO
 * @Author yangkun
 * @Date 2020/7/30
 * @Version 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface DataSourceSelector {

    DynamicDataSourceEnum value() default DynamicDataSourceEnum.MASTER;
    boolean clear() default true;
}
