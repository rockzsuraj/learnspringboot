package com.learn.springboot.learnspringboot.config;
import com.learn.springboot.learnspringboot.common.Coach;
import com.learn.springboot.learnspringboot.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
