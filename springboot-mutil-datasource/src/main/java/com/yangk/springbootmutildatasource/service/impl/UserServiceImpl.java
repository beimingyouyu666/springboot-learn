package com.yangk.springbootmutildatasource.service.impl;

import com.yangk.springbootmutildatasource.config.DataSourceSelector;
import com.yangk.springbootmutildatasource.config.DynamicDataSourceEnum;
import com.yangk.springbootmutildatasource.domain.dos.UserDO;
import com.yangk.springbootmutildatasource.mapper.UserMapper;
import com.yangk.springbootmutildatasource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    @DataSourceSelector(value = DynamicDataSourceEnum.SLAVE)
    public List<UserDO> listUser() {
        List<UserDO> users = userMapper.selectAll();
        return users;
    }

    @Override
    @DataSourceSelector(value = DynamicDataSourceEnum.MASTER)
    public int update() {
        UserDO user = new UserDO();
        user.setUserId(1196978513958141952L);
        user.setUserName("修改后的名字2");
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    @DataSourceSelector(value = DynamicDataSourceEnum.SLAVE)
    public UserDO find() {
        UserDO user = new UserDO();
        user.setUserId(1196978513958141952L);
        return userMapper.selectByPrimaryKey(user);
    }
}
