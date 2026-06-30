package com.rohit.jobapp.controller;

import com.rohit.jobapp.model.JobPost;
import com.rohit.jobapp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JobRestController {

    @Autowired
    private JobService jobService;

    @PostMapping("addjob")
    public String addJob(@RequestBody JobPost jobPost) {
        jobService.addJob(jobPost);
        return "Job Added";
    }

    @GetMapping("viewjobs")
    public List<JobPost> getAllJobs() {
        return jobService.getAllJobs();
    }
}
