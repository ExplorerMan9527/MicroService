package com.lgj.com.micro.service.consumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lgj.api.UserService;
import com.lgj.com.micro.service.consumer.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author guangjie.Liao
 * @Title: UserServiceImpl
 * @ProjectName micro-parent
 * @Description: TODO
 * @date 2018/10/179:54
 */
@Component
public class UserServiceImpl implements OrderService {

    @Reference
    private UserService userService;

    @Override
    public String sayHello() {
        return userService.sayHello("dubbo");
    }
}
