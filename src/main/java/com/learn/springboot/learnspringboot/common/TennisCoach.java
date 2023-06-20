package com.learn.springboot.learnspringboot.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Lazy
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class TennisCoach implements Coach{

    public TennisCoach(){
        System.out.println("Constructor: "+ getClass().getSimpleName());
    }

    //define out init method
//    @PostConstruct
//    public void doMyStartupStuff() {
//        System.out.println("In doMyStartupStuff");
//    }
//
//    //define our destroy method
//    @PreDestroy
//    public void doMyCleanUpStuff() {
//        System.out.println("In doMyCleanUpStuff");
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backend volley!";
    }
}
