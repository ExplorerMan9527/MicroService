package com.lgj.com.micro.service.consumer.controller;

import com.lgj.com.micro.service.consumer.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guangjie.Liao
 * @Title: UserController
 * @ProjectName micro-parent
 * @Description: TODO
 * @date 2018/10/197:48
 */
@RestController
@RequestMapping(value="/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value = "/test" ,method = RequestMethod.GET)
    public String  test(){
        return userService.sayHello();
    }
}
