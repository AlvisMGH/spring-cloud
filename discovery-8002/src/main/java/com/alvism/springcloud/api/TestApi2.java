package com.alvism.springcloud.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test2")
public class TestApi2 {

    @RequestMapping("/hello2")
    public String hello() {
        return "啊额呵呵呵呵呵呵呵呵呵BBBBB";
    }

}
