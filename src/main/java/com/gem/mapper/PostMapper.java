package com.gem.mapper;

import com.gem.entity.Post;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {
    List<Post> getAllPosts();

    void insert(Post post);
}
