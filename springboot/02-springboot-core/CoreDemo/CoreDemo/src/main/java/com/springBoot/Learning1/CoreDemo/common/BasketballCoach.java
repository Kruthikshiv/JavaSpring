package com.springBoot.Learning1.CoreDemo.common;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {

    BasketballCoach(){
        System.out.println("In Constructor : "+ getClass().getSimpleName());
    }

    @Override
    public String CIgetDaliyWorkout(){
        return "Practice 3 pointers for 30 mins daily!, Using constructor Injection ";
    }

    @Override
    public String SIgetDaliyWorkout(){
        return "Practice  3 pointers for 30 mins daily!, Using setter Injection";
    }
}
