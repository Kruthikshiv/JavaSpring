package com.springBoot.Learning1.CoreDemo.rest;

import com.springBoot.Learning1.CoreDemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTController {

    //Local variable to store coach obj;
    private Coach myCoach;
    private Coach myCoach1;

    // define constructor for DI
    @Autowired
    RESTController(@Qualifier("basketballCoach") Coach theCoach){
        System.out.println("In Constructor : "+ getClass().getSimpleName());
        myCoach = theCoach;
    }

    //Autowired for Setter Injection
    @Autowired
    void getCoach(@Qualifier("tennisCoach") Coach theCoach){
        myCoach1 = theCoach;
    }

    @GetMapping("/CI_dailyworkout")
    public String CIgetDailyWorkout(){
        return myCoach.CIgetDaliyWorkout();
    }

    @GetMapping("/SI_dailyworkout")
    public String SIsetCoach(){
        return myCoach1.SIgetDaliyWorkout();
    }

}
