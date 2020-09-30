package com.leexm.demo.cloud.consumer.hystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @author leexm
 * @date 2020-09-27 07:46
 */
@Component
public class HelloService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    public String hello() {
        return restTemplate.getForObject("http://hello-service/hello", String.class);
    }

    public String fallback() {
        return "fallback";
    }

}
