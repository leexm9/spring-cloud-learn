package com.leexm.demo.cloud.consumer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author leexm
 * @date 2020-09-27 01:08
 */
@RestController
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/hello")
    public String hello() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("hello-service");
        String url = String.format("http://%s:%d/hello", serviceInstance.getHost(), serviceInstance.getPort());
        logger.info("URL:" + url);
        return restTemplate.getForObject(url, String.class);
    }

}
