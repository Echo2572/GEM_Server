package com.gem.service;

import com.gem.entity.User;
import com.gem.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> getAllUsers(){
        return userMapper.getAllUsers();
    }
}
