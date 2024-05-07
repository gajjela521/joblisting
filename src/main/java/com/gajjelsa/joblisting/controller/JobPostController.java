package com.gajjelsa.joblisting.controller;

import com.gajjelsa.joblisting.repository.JobPostRepository;
import com.gajjelsa.joblisting.model.JobPost;
import com.gajjelsa.joblisting.repository.SearchRepository;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class JobPostController {
    @Autowired
    JobPostRepository repo;
    @Autowired
    SearchRepository srepo;
    @ApiIgnore
    @RequestMapping(value="/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }
    @GetMapping("/posts")
    @CrossOrigin
    public List<JobPost> getAllJobPosts(){
     return repo.findAll();
    }
    @GetMapping("/posts/{text}")
    @CrossOrigin
    public List<JobPost> search(@PathVariable String text){
        return srepo.findByText(text);
    }
    @PostMapping(value="/post")
    @CrossOrigin
    public JobPost addPost(@RequestBody JobPost jobpost){
        return repo.save(jobpost);
    }
}
