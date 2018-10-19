package com.lgj.com.micro.service.consumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.lgj.api.UserService;
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
public class UserServiceImpl {
    @Reference
    private UserService userService;

    public void test(){
        userService.sayHello("dubbo");
    }

}
