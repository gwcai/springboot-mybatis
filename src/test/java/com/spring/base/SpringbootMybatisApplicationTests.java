package com.spring.base;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
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
}
