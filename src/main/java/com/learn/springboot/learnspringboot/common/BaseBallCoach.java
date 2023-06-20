package com.learn.springboot.learnspringboot.common;

import org.springframework.stereotype.Component;

@Component
public class BaseBallCoach implements Coach{

    public BaseBallCoach(){
        System.out.println("Constructor: "+ getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Spend 30 minute in batting practice!";
    }
}
