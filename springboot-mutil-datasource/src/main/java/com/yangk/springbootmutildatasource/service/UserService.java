package com.yangk.springbootmutildatasource.service;

import com.yangk.springbootmutildatasource.config.DataSourceSelector;
import com.yangk.springbootmutildatasource.config.DynamicDataSourceEnum;
import com.yangk.springbootmutildatasource.domain.dos.UserDO;

import java.util.List;

/**
 * @Description
 * @Author yangkun
 * @Date 2020/7/29
 * @Version 1.0
 * @blame yangkun
 */
public interface UserService {

    List<UserDO> listUser();

    int update();

    UserDO find();
}
