package com.leexm.demo.cloud.provider2.client.service;

import com.leexm.demo.cloud.provider2.client.domain.Person;
import com.leexm.demo.cloud.provider2.client.service.fallback.HelloServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @author leexm
 * @date 2020-09-30 01:23
 */
@FeignClient(value = "hello-service", fallback = HelloServiceFallback.class)
public interface HelloService {

    @GetMapping("/refactor/hello1")
    String hello(@RequestParam("name") String name);

    @GetMapping("/refactor/hello2")
    Person hello(@RequestParam("name") String name, @RequestParam("age") Integer age);

    @PostMapping("/refactor/hello3")
    String hello(@RequestBody Person person);

}