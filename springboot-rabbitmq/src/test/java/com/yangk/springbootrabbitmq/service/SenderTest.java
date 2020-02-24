package com.yangk.springbootrabbitmq.service;

import com.yangk.springbootrabbitmq.SpringbootRabbitmqApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Description 测试mq消息发送与接收
 * @Author yangkun
 * @Date 2020/2/24
 * @Version 1.0
 * @blame yangkun
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringbootRabbitmqApplication.class)
public class SenderTest {

    @Autowired
    private Sender sender;

    @Test
    public void contextLoads() {
        sender.send();
    }
}