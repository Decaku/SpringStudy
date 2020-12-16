package com.decaku.config;

import com.decaku.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.decaku.pojo")
public class MyConfig {
    @Bean
    public User getUser() {
        return new User();
    }

}
