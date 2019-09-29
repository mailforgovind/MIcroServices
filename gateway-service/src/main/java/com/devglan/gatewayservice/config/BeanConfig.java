package com.devglan.gatewayservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public AddRequestHeaderFilter addRequestHeaderFilter(){
        return new AddRequestHeaderFilter();
    }
}
