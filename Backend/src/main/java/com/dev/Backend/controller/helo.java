package com.dev.Backend.controller;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class helo {

    @GetMapping("/")
    public String hello(){
        return "teste " +new Date();
    }
    
}
