package com.alvism.springcloud.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestApi {

    @RequestMapping("/hello")
    public String hello(){
        return "8001减少库存";
    }

}
