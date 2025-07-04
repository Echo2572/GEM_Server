package com.gem.service;

import com.gem.entity.Post;
import com.gem.mapper.PostMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostMapper postMapper;

    public List<Post> getAllPosts(){
        return postMapper.getAllPosts();
    }

    public void addPost(Post post){
        postMapper.insert(post);
    }

    public void deletePost(Integer id){
        postMapper.deleteById(id);
    }

    public void updatePost(Post post){
        postMapper.updatePost(post);
    }
}
