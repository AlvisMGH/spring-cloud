package com.alvism.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class Zuul6001Application {

    public static void main(String[] args) {
        SpringApplication.run(Zuul6001Application.class, args);
    }

}
