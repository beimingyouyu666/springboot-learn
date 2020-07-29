package com.yangk.springbootmutildatasource.service.impl;

import com.yangk.springbootmutildatasource.SpringbootMutilDatasourceApplicationTests;
import com.yangk.springbootmutildatasource.mapper.UserMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;


public class UserServiceImplTest extends SpringbootMutilDatasourceApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void getUserById() {
        userMapper.getUserById("111");
    }
}