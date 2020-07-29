package com.yangk.springbootmutildatasource.service.impl;

import com.yangk.springbootmutildatasource.config.Slave;
import com.yangk.springbootmutildatasource.domain.dos.UserDO;
import com.yangk.springbootmutildatasource.mapper.UserMapper;
import com.yangk.springbootmutildatasource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Author yangkun
 * @Date 2020/7/29
 * @Version 1.0
 * @blame yangkun
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @Slave
    public UserDO getUserById(String userId) {
        return userMapper.getUserById(userId);
    }
}
