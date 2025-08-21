package com.xworkz.snake.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com")
public class SnakeConfiguration {

    public SnakeConfiguration(){
        System.out.println("snake configuration");
    }
    @Bean
    String getting(){
        System.out.println("running get");
        return "email";
    }

    String putting(){
        System.out.println("Without Bean");
        return "";
    }
}
