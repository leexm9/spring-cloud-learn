package com.leexm.demo.cloud.provider2.client;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author leexm
 * @date 2020-10-02 13:11
 */
@Configuration
@ComponentScan
@EnableFeignClients
public class ServiceProviderConfig {
}
