package com.gem.mapper;

import com.gem.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> getAllUsers();

    void insert(User user);

    void deleteById(Integer id);

    void updateUser(User user);
}
