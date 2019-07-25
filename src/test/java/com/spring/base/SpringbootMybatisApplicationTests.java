package com.spring.base;

import com.alibaba.fastjson.JSON;
import com.spring.base.domain.User;
import com.spring.base.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringbootMybatisApplication.class})
public class SpringbootMybatisApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    private UserService userService;

    @Test
    public void getUserById() {
        List<User> user = userService.selectAll();
        System.out.println(JSON.toJSONString(user));
    }
}
