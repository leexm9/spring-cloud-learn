package com.leexm.demo.cloud.consumer.hystrix.service;

import com.leexm.demo.cloud.consumer.hystrix.service.fallback.DefaultFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author leexm
 * @date 2020-09-27 07:46
 */
@FeignClient(value = "hello-service", fallback = DefaultFallback.class)
public interface HelloService1 {

    @GetMapping("/hello")
    String hello();

}
