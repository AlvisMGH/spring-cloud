package com.alvism.springcloud.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test1")
public class TestApi1 {

    @RequestMapping("/hello1")
    public String hello(){
        return "啊哈哈哈哈哈哈哈AAAAA";
    }

}
