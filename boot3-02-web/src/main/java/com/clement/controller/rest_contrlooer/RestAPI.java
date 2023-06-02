package com.clement.controller.rest_contrlooer;

import com.clement.polo.Dog;
import com.clement.polo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 1.REST默认返回json
 * 2.默认基于请求头 进行内容协商
 * 3.
 */

@RestController
public class RestAPI {
    @RequestMapping("/user")
    public User userInfo(){
        return new User(1,"Clement",18);
    }
    @RequestMapping("/dog")
    public Dog dogInfo(){
        return new Dog(1,"Clement",18);
    }

}
