package com.example.controller;

import com.example.model.Candidate;
import com.example.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CandidateController {

    @Autowired
    CandidateService service;

    @GetMapping("/candidate/{id}")
    public List<Candidate> fetchUserDtoList(@PathVariable("id") String id) {
        return service.findById(id);
    }
}
