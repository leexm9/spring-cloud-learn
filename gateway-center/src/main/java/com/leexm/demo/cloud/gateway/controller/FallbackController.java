package com.leexm.demo.cloud.gateway.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author leexm
 * @date 2020-10-03 17:04
 */
@RestController
public class FallbackController {

    /**
     * 发生熔断调用的请求
     *
     * @return
     */
    @GetMapping(value = "/fallback", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> fallback() {
        return new ResponseEntity<>("error", HttpStatus.OK);
    }

}
