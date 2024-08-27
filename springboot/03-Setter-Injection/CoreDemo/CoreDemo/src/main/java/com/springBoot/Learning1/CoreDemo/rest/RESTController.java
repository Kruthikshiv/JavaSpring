package com.springBoot.Learning1.CoreDemo.rest;

import com.springBoot.Learning1.CoreDemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTController {

    //Local varialbe to store coach obj;
    private Coach myCoach;

    // define constructor for DI
    @Autowired
    RESTController(Coach theCoach){
        myCoach = theCoach;
    }

    //Autowired for Setter Injection
    @Autowired
    void getCoach(Coach theCoach){
        myCoach = theCoach;
    }

    @GetMapping("/CI_dailyworkout")
    public String CIgetDailyWorkout(){
        return myCoach.CIgetDaliyWorkout();
    }

    @GetMapping("/SI_dailyworkout")
    public String SIsetCoach(){
        return myCoach.SIgetDaliyWorkout();
    }

}
