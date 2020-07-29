package com.yangk.springbootrocketmq.service;

import com.alibaba.fastjson.JSON;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

/**
 * @Description TODO
 * @Author yangkun
 * @Date 2020/3/3
 * @Version 1.0
 * @blame yangkun
 */
@Service
@RocketMQMessageListener(topic = "test-topic-2", consumerGroup = "my-consumer_test-topic-2")
public class OrderPaidEventConsumer implements RocketMQListener<OrderPaidEvent> {

    @Override
    public void onMessage(OrderPaidEvent message) {

        System.out.print("------- OrderPaidEventConsumer received:"+ JSON.toJSONString(message));
    }

}

