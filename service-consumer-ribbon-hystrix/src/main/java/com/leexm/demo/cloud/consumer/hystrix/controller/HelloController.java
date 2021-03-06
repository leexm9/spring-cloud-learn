package com.leexm.demo.cloud.consumer.hystrix.controller;

import com.leexm.demo.cloud.consumer.hystrix.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leexm
 * @date 2020-09-27 01:08
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello")
    public String hello() {
        return helloService.hello();
    }

}
