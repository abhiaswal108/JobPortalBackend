package com.aa.jobportal.service;


import com.aa.jobportal.entity.Post;
import com.aa.jobportal.repo.PostRepo;
import com.aa.jobportal.repo.SearchRepo;
import com.aa.jobportal.repo.SearchRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    SearchRepo sr;

    @Autowired
    PostRepo pr;
    public List<Post> getAll(){
            return pr.findAll();
    }

    public Post addPost(Post post) {
        return pr.save(post);
    }

    public List<Post> searchPost(String post) {
        return sr.findByText(post);
    }
}
