package com.yangk.springbootmutildatasource.controller;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.yangk.springbootmutildatasource.domain.dos.UserDO;
import com.yangk.springbootmutildatasource.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author yangkun
 * @Date 2020/7/29
 * @Version 1.0
 * @blame yangkun
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("getUser")
    public String getUser(String userId){
        UserDO user = userService.getUserById(userId);
        return user.getUserId();
    }
}
