package com.gajjelsa.joblisting.repository;

import com.gajjelsa.joblisting.model.JobPost;

import java.util.List;

public interface SearchRepository {
    List<JobPost> findByText(String text);
}
