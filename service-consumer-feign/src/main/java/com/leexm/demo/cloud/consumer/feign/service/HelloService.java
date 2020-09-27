package com.leexm.demo.cloud.consumer.ribbon.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author leexm
 * @date 2020-09-27 07:46
 */
@FeignClient("hello-service")
public interface HelloService {

    @GetMapping("/hello")
    String hello();

}
