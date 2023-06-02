package com.clement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author Qinghan Huang
 * @Date 2023/6/2 16:10
 * @Desc
 * @Version 1.0
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    public String hello(){
        return "test";

    }
}
