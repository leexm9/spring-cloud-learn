package com.leexm.demo.cloud.consumer.feign.controller;

import com.leexm.demo.cloud.consumer.feign.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author leexm
 * @date 2020-09-27 01:08
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/feign-hello")
    public String hello() {
        return helloService.hello();
    }

}
