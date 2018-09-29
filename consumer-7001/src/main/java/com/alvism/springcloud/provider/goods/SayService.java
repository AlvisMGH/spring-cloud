package com.alvism.springcloud.provider.goods;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "EUREKA-CLIENT-GOODS")
public interface SayService {

    @RequestMapping(method = RequestMethod.POST, value = "/app/say")
    String say();

}
