package com.leexm.demo.cloud.consumer.hystrix.controller;

import com.leexm.demo.cloud.consumer.hystrix.service.HelloService1;
import com.leexm.demo.cloud.provider2.client.domain.Person;
import com.leexm.demo.cloud.provider2.client.service.HelloService;
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

    @Autowired
    private HelloService1 helloService1;

    @GetMapping("/feign-hello")
    public String hello() {
        return helloService1.hello();
    }

    @GetMapping(value = "/feign-hello2")
    public String helloConsumer2() {
        StringBuilder sb = new StringBuilder();
        sb.append(helloService.hello("DIDI")).append(System.lineSeparator());
        sb.append(helloService.hello("DIDI", 30)).append(System.lineSeparator());
        sb.append(helloService.hello(new Person("DIDI", 30))).append(System.lineSeparator());
        System.out.println(sb.toString());
        return sb.toString();
    }

    @GetMapping(value = "/feign-hello3")
    public String helloConsumer3() {
        StringBuilder sb = new StringBuilder();
        sb.append(helloService.hello("MIMI")).append(System.lineSeparator());
        sb.append(helloService.hello("MIMI", 20)).append(System.lineSeparator());
        sb.append(helloService.hello(new Person("MIMI", 20))).append(System.lineSeparator());
        return sb.toString();
    }

}
