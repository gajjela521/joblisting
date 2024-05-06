package com.gajjelsa.joblisting.repository;

import com.gajjelsa.joblisting.model.JobPost;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JobPostRepository extends MongoRepository<JobPost,String> {
}
