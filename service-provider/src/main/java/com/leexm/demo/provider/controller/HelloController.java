package com.leexm.demo.provider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leexm
 * @date 2020-09-26 21:05
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello, world!";
    }

}
