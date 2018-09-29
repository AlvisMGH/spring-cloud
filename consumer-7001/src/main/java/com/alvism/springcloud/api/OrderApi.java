package com.alvism.springcloud.api;

import com.alvism.springcloud.provider.discovery.TestService;
import com.alvism.springcloud.provider.goods.SayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/order")
public class OrderApi {

    @Autowired
    private TestService testService;

    @Autowired
    private SayService sayService;

    @RequestMapping("/hello")
    public String hello(){
        return "下单成功" + testService.hello() + ">>>" + sayService.say();
    }

}
