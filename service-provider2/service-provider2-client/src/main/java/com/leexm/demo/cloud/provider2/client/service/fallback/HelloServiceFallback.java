package com.leexm.demo.cloud.provider2.client.service.fallback;

import com.leexm.demo.cloud.provider2.client.domain.Person;
import com.leexm.demo.cloud.provider2.client.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * @author leexm
 * @date 2020-09-30 01:33
 */
@Component
public class HelloServiceFallback implements HelloService {

    @Override
    public String hello(String name) {
        return "error";
    }

    @Override
    public Person hello(String name, Integer age) {
        return new Person("未知", 0);
    }

    @Override
    public String hello(Person person) {
        return "error";
    }

}
