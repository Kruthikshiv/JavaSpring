package com.springBoot.Learning1.CoreDemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    TennisCoach(){
        System.out.println("In Constructor : "+ getClass().getSimpleName());
    }

    @Override
    public String CIgetDaliyWorkout() {
        return "Start with warm ups, and practice forehand and backhand for 1 hour, Using CI";
    }

    @Override
    public String SIgetDaliyWorkout() {
        return "Start with warm ups, and practice forehand and backhand for 1 hour, Using CI";
    }
}
