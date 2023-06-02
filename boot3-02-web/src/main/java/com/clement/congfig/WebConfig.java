package com.clement.congfig;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author Qinghan Huang
 * @Date 2023/6/2 16:26
 * @Desc
 * @Version 1.0
 */
@Configuration
public class WebConfig  implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //保留
        WebMvcConfigurer.super.addResourceHandlers(registry);
        //添加自己设置
//        registry.addResourceHandler("/**")
//                .addResourceLocations("classpath:/a/","classpath:/b/");
    }
}
