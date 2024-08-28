package com.springBoot.Learning1.CoreDemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Lazy // removed Lazy initialization
public class TrackCoach implements Coach{

    TrackCoach(){
        System.out.println("In Constructor : "+ getClass().getSimpleName());
    }

    @Override
    public String CIgetDaliyWorkout() {
        return "Start With warm ups for 10 mins, start running to improve stamina, Using CI";
    }

    @Override
    public String SIgetDaliyWorkout() {
        return "Start With warm ups for 10 mins, start running to improve stamina, Using SI";
    }
}
