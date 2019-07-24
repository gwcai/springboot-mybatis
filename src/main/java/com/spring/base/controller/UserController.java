package com.spring.base.controller;

import com.spring.base.domain.User;
import com.spring.base.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author FUDIAN
 */
@RestController("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    User getUserById(@PathVariable("id") String userId){
        return userService.getUserById(userId);
    }
}
