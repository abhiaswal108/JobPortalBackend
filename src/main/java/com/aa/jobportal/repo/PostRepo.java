package com.aa.jobportal.repo;

import com.aa.jobportal.entity.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepo extends MongoRepository<Post,String> {

}
