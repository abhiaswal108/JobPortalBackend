package com.aa.jobportal.repo;

import com.aa.jobportal.entity.Post;

import java.util.ArrayList;
import java.util.List;

public class SearchRepoImpl  implements  SearchRepo{



    @Override
    public List<Post> findByText(String text) {
        final List<Post> posts = new ArrayList<>();

        return posts;
    }
}
