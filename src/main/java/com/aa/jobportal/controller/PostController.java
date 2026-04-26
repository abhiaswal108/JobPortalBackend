package com.aa.jobportal.controller;


import com.aa.jobportal.entity.Post;
import com.aa.jobportal.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostService ps;
    @GetMapping("/getAll")
    public List<Post> getAllPost(){
        return ps.getAll();

    }
    @PostMapping("/add")
    public Post addPost(@RequestBody Post post){
        return ps.addPost(post);

    }
    @GetMapping("/filter/{text}")
    public List<Post> searchPost(@PathVariable String text){
        return ps.searchPost(text);

    }
}
