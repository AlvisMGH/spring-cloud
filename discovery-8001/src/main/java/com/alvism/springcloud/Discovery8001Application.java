package com.alvism.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Discovery8001Application {

    public static void main(String[] args) {
        SpringApplication.run(Discovery8001Application.class, args);
    }

}
