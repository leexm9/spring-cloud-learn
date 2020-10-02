package com.leexm.demo.cloud.consumer.hystrix.service.fallback;

import com.leexm.demo.cloud.consumer.hystrix.service.HelloService1;
import org.springframework.stereotype.Component;

/**
 * @author leexm
 * @date 2020-10-02 14:45
 */
@Component
public class DefaultFallback implements HelloService1 {

    @Override
    public String hello() {
        return "default";
    }

}
