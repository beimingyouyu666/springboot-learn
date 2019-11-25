package com.yangk.springbootthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description TODO
 * @Author yangkun
 * @Date 2019/9/23
 * @Version 1.0
 * @blame yangkun
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(HttpServletRequest request, @RequestParam(value = "name", defaultValue = "springboot" +
            "-thymeleaf") String name) {
        request.setAttribute("name", name);
        return "hello";
    }
}