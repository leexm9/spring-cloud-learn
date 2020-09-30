package com.leexm.demo.cloud.provider2.web.controller;

import com.leexm.demo.cloud.provider2.client.domain.Person;
import com.leexm.demo.cloud.provider2.client.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leexm
 * @date 2020-09-30 01:39
 */
@RestController
public class HelloController implements HelloService {

    @GetMapping("/hello")
    public String hello() {
        return "hello, world!";
    }

    @Override
    public String hello(@RequestParam("name") String name) {
        return "Hello " + name;
    }

    @Override
    public Person hello(@RequestParam("name") String name, @RequestParam("age") Integer age) {
        return new Person(name, age);
    }

    @Override
    public String hello(@RequestBody Person person) {
        return "Hello "+ person.getName() + ", " + person.getAge();
    }

}
