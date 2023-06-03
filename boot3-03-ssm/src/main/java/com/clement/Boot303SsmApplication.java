package com.clement;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages="com.clement.dao")
public class Boot303SsmApplication {

    public static void main(String[] args) {
        SpringApplication.run(Boot303SsmApplication.class, args);
    }

}
