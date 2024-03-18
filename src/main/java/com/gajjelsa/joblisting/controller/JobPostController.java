package com.gajjelsa.joblisting.controller;

import com.gajjelsa.joblisting.JobPostRepository;
import com.gajjelsa.joblisting.model.JobPost;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.io.IOException;
import java.util.List;

@RestController
//@CrossOrigin(origins = "http://localhost:8080")
public class JobPostController {
    @Autowired
    JobPostRepository repo;
    @ApiIgnore
    @PostMapping(value="/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }
    @GetMapping("/posts")
    @CrossOrigin
    public List<JobPost> getAllJobPosts(){
     return repo.findAll();
    }
    @PostMapping("/post")
    @CrossOrigin
    public JobPost addPost(@RequestBody JobPost jobpost){
        return repo.save(jobpost);
    }
}
