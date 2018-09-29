package com.alvism.springcloud.provider.discovery;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "DISCOVERY")
@RequestMapping(value = "/test")
public interface TestService {

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    String hello();

}
