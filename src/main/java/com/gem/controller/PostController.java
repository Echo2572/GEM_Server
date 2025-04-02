package com.gem.controller;

import com.gem.common.Result;
import com.gem.entity.Post;
import com.gem.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/post")
public class PostController {
    @Autowired
    private PostService postService;

    @GetMapping("/all")
    public Result getAllPosts(){
        List<Post> postList = postService.getAllPosts();
        return Result.success(postList);
    }

    @PostMapping("/add")
    public Result addPost(@RequestBody Post post){
        postService.addPost(post);
        return Result.success();
    }
}
