package com.yangk.springbootmutildatasource.service;

import com.yangk.springbootmutildatasource.domain.dos.UserDO;

/**
 * @Description
 * @Author yangkun
 * @Date 2020/7/29
 * @Version 1.0
 * @blame yangkun
 */
public interface UserService {

    UserDO getUserById(String userId);
}
