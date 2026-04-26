package com.aa.jobportal.repo;

import com.aa.jobportal.entity.Post;

import java.util.List;

public interface SearchRepo {


    List<Post> findByText(String text);
}
