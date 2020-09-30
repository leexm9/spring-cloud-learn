package com.leexm.demo.cloud.provider2.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ServiceProvider2 {

    public static void main(String[] args) {
        SpringApplication.run(ServiceProvider2.class, args);
    }

}
