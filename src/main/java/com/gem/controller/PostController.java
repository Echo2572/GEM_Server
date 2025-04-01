package com.gem.controller;

import com.gem.common.Result;
import com.gem.entity.Post;
import com.gem.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {
    @Autowired
    private PostService postService;

    @GetMapping("/post")
    public Result getAllPosts(){
        List<Post> postList = postService.getAllPosts();
        return Result.success(postList);
    }
}
