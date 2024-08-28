package com.springBoot.Learning1.CoreDemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//component marks class as Spring Bean indicating can be used for DI
@Component
public class CricketCoach implements Coach {

    CricketCoach()
    {
        System.out.println("In Constructor : "+ getClass().getSimpleName());
    }
    @Override
    public String CIgetDaliyWorkout(){
        return "Practice Bowling for 15 mins daily!, Using constructor Injection ";
    }

    @Override
    public String SIgetDaliyWorkout(){
        return "Practice Bowling for 15 mins daily!, Using setter Injection";
    }
}
