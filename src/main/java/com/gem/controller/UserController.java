package com.gem.controller;

import com.gem.common.Result;
import com.gem.entity.User;
import com.gem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public Result getAllUsers(){
        List<User> userList = userService.getAllUsers();
        return Result.success(userList);
    }
}
