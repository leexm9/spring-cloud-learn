package com.leexm.demo.cloud.consumer.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author leexm
 * @date 2020-09-27 02:12
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class FeignHystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignHystrixApplication.class, args);
    }

}
