package com.clement.controller;

import com.clement.dao.UserMapper;
import com.clement.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author Qinghan Huang
 * @Date 2023/6/3 18:03
 * @Desc
 * @Version 1.0
 */


/*
整合mybatis最重要两件事
1.告诉application mapper的包在哪----通过@MapperScan()
2.告诉mybatis,mapper 对应的xml在哪----通过 properties文件中
mybatis.mapper-locations=classpath:/mapper/*.xml的设置
 */


@Controller
public class MainController {
    @Autowired
    UserMapper userMapper;
    @RequestMapping("/test")
    public String testConnect(){
        return "test";
    }
    @ResponseBody
    @RequestMapping("/user/{id}")
    public User userInfo( @PathVariable int id ){
        User userById = userMapper.getUserById(id);
        return userById;
    }

}
