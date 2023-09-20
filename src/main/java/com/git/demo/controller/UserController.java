package com.git.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/test")
    public String test(){
        System.out.println("dev");
        return "测试";
    }
}
