package com.leexm.demo.cloud.provider.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.serviceregistry.Registration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

/**
 * @author leexm
 * @date 2020-09-26 21:05
 */
@RestController
public class HelloController {

    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private Registration registration;

    @GetMapping("/hello")
    public String hello() throws InterruptedException {
        int sleepTime = ThreadLocalRandom.current().nextInt(3000);
        TimeUnit.MILLISECONDS.sleep(sleepTime);
        logger.info("sleepTime:" + sleepTime);

        logger.info("/hello1, host:" + registration.getInstanceId() + ", service_id:" + registration.getServiceId());
        return "hello, world!";
    }

}
