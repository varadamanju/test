package com.in.sample.controller;


import com.in.sample.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin("*")
@RestController
@RequestMapping("/")
public class SampleController {
    @Autowired
    SampleService sampleService;
    @GetMapping("/getInfo")
    public String getSampleMessage(){
        return sampleService.getSampleMessage();
    }
}
