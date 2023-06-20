package com.learn.springboot.learnspringboot.rest;

import com.learn.springboot.learnspringboot.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //field injection not recommended as it makes code harder to unit test
//    @Autowired
//    private @Qualifier("cricketCoach") Coach myCoach;

    //    define private field for the dependency
    private Coach myCoach;
    private Coach anotherCoach;

    //    Define a constructor for dependency injection
    @Autowired
    public DemoController(
            @Qualifier("aquatic") Coach theCoach,
            @Qualifier("aquatic") Coach theAnotherCoach
    ) {
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;
        System.out.println("Constructor: " + getClass().getSimpleName());
    }

    //Define setter for dependency injection
//    @Autowired
//    public void doSetCoach(Coach theCoach){
//        myCoach = theCoach;
//    }


    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

    @GetMapping("/check")
    public String check() {
        return "Comparing beans: myCoach === anotherCoach, " + (myCoach == anotherCoach);
    }


}
