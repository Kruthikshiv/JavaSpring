package com.springBoot.Learning1.CoreDemo.common;

import org.springframework.stereotype.Component;

//component marks class as Spring Bean indicating can be used for DI
@Component
public class CrciketCoach implements Coach {

    @Override
    public String getDaliyWorkout(){
        return "Practice Bowling for 15 mins daily!";
    }
}
