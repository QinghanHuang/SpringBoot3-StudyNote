package com.clement.controller;

import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Qinghan Huang
 * @Date 2023/6/2 13:12
 * @Desc
 * @Version 1.0
 */
@RestController
public class Hello {
    @RequestMapping("/")
    public String hello(){
        return "Hello!";
    }
}
