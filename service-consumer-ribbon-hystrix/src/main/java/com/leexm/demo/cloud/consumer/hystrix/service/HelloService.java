package com.leexm.demo.cloud.consumer.hystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

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
        int random = ThreadLocalRandom.current().nextInt(10);
        if (random < 5) {
            return restTemplate.getForObject("http://hello-service/hello", String.class);
        } else {
            try {
                TimeUnit.MILLISECONDS.sleep(random * 250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "one year later!";
        }
    }

    public String fallback() {
        return "fallback";
    }

}
