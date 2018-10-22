package com.lgj.com.micro.service.producer.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lgj.api.UserService;
import org.springframework.stereotype.Component;

/**
 * @author guangjie.Liao
 * @Title: UserServiceImpl
 * @ProjectName micro-parent
 * @Description: TODO
 * @date 2018/10/1214:52
 */
@Component
public class UserServiceImpl implements UserService {

    @Override
    public String sayHello(String name) {
        return "Hello "+name + " follower";

    }
}
