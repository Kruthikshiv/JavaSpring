package com.springBoot.Learning1.CoreDemo.common;

public class SwimCoach implements Coach{

    public SwimCoach(){
        System.out.println("In Constructor"+ getClass().getSimpleName());
    }

    @Override
    public String SIgetDaliyWorkout() {
        return "Swim 100 meters daily using, using SI ";
    }

    @Override
    public String CIgetDaliyWorkout() {
        return "Swim 100 meters daily using, using CI ";
    }
}
