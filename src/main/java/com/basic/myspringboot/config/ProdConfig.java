package com.basic.myspringboot.config;

import com.basic.myspringboot.dto.Customer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("prod")
@Configuration
public class ProdConfig {
    @Bean
    public Customer customer() {
        return Customer.builder() // CustomerBuilder라는 inner 클래스가 만들어진다
                .name("운용모드")
                .age(50)
                .build();
    }
}
