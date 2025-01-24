package com.ec2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World - GET";
    }

    @PostMapping("/hello")
    public String post() {
        return "Hello World - POST";
    }
}
