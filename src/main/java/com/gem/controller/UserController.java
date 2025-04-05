package com.gem.controller;

import com.gem.common.Result;
import com.gem.entity.User;
import com.gem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/all")
    public Result getAllUsers(){
        List<User> userList = userService.getAllUsers();
        return Result.success(userList);
    }

    @PostMapping("/add")
    public Result addUser(@RequestBody User user){
        userService.addUser(user);
        return Result.success();
    }

    @DeleteMapping("/delete/{id}")
    public Result deleteById(@PathVariable Integer id){
        userService.deleteById(id);
        return Result.success();
    }
}
