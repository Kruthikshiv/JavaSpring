package com.springBoot.Learning1.CoreDemo.common;

import org.springframework.stereotype.Component;

@Component
public class TrachCoach implements Coach{
    @Override
    public String CIgetDaliyWorkout() {
        return "Start With warm ups for 10 mins, start running to improve stamina, Using CI";
    }

    @Override
    public String SIgetDaliyWorkout() {
        return "Start With warm ups for 10 mins, start running to improve stamina, Using SI";
    }
}
