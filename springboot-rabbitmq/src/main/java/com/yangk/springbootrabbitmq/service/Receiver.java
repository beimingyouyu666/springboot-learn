package com.yangk.springbootrabbitmq.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Description rabbit接收方
 * @Author yangkun
 * @Date 2020/2/24
 * @Version 1.0
 * @blame yangkun
 */
@Component
@RabbitListener(queues = "hello")
@Slf4j
public class Receiver {
    @RabbitHandler
    public void process(String msg) {
        System.out.println("-----------------Receiver:"+msg);
    }
}
