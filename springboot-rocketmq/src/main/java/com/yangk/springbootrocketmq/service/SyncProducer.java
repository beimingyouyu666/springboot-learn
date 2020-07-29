package com.yangk.springbootrocketmq.service;

import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;

/**
 * @Description TODO
 * @Author yangkun
 * @Date 2020/3/3
 * @Version 1.0
 * @blame yangkun
 */
public class SyncProducer {
    public static void main(String[] args) throws MQClientException, InterruptedException {
        DefaultMQProducer producer = new DefaultMQProducer("test_producer");
        producer.setNamesrvAddr("114.215.147.110:9876");
        producer.start();
        for (int i = 0; i < 10; i++) {
            new Thread(()->{
//                while (true) {
                    try {
                        Message message = new Message("TopicTest","TagA",("Test").getBytes(RemotingHelper.DEFAULT_CHARSET));
                        producer.send(message);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
//                }
            }).start();
        }

        while (true) {
            Thread.sleep(1000);
        }

    }
}
