package com.lgj.com.micro.service.consumer;

import com.lgj.com.micro.service.consumer.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author guangjie.Liao
 * @Title: UserTest
 * @ProjectName micro-parent
 * @Description: TODO
 * @date 2018/10/198:39
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {
    @Autowired
    private UserServiceImpl userService;

    @Test
    public void test() {
        userService.test();
    }

}
