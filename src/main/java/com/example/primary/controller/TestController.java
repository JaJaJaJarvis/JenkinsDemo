package com.example.primary.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("testC")
public class TestController {


    @GetMapping("get")
    public String getFun(){
        return "Demo GET....";
    }
}
