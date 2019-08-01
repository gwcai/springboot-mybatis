package com.spring.base;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.spring.base.domain.User;
import com.spring.base.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringbootMybatisApplication.class})
public class SpringbootMybatisApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    private UserService userService;

    @Test
    public void selectAll() {
        PageInfo page = userService.selectAll(1,10);
        System.out.println(JSON.toJSONString(page));
    }

    @Test
    public void insert(){
        User user = new User();
        user.setId("2");
        user.setName("张珊");
        user.setAge(20);
        user.setGender("女");
        int result = userService.insert(user);
        System.out.println(result);
    }

    @Test
    public void update(){
        User user = new User();
        user.setId("2");
        user.setAge(22);
        int result = userService.update(user);
        System.out.println(result);
    }
}
