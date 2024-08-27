package com.springBoot.Learning1.CoreDemo.rest;

import com.springBoot.Learning1.CoreDemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTController {

    private Coach myCoach;

    // define constructir for DI
    @Autowired
    RESTController(Coach theCoach){
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDaliyWorkout();
    }
}
