package com.springBoot.Learning1.CoreDemo.rest;

import com.springBoot.Learning1.CoreDemo.common.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class RESTController {

    //Local variable to store coach obj;
    private Coach myCoach;
    private Coach myCoach1;

    //To Demonstrate Prototype bean Scope
    //private Coach theanotherCoach;

    //To Demonstrate PostConstruct and PreDestroy
    //Define your init method
    @PostConstruct
    void postConstructBean(){
        System.out.println("Hello from post Construct : "+ getClass().getSimpleName());
    }

    //Define our destroy method
    @PreDestroy
    void preDestroyBean(){
        System.out.println("Hello from PreDestroy: " + getClass().getSimpleName());
    }
    //End Of PostConstruct and PreDestroy


    // define constructor for DI
    @Autowired
    RESTController(@Qualifier("basketballCoach") Coach theCoach){
                   ////To Demonstrate Prototype bean Scope
                   //@Qualifier("basketballCoach") Coach anotherCoach){
        System.out.println("In Constructor : "+ getClass().getSimpleName());
        myCoach = theCoach;
        //To Demonstrate Prototype bean Scope
        // theanotherCoach = anotherCoach;
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


    // To Demonstrate Prototype
//    @GetMapping("/check")
//    public String isScopeEqual(){
//        return "Condition coach == anotherCoach evaluates to : "+ (myCoach==theanotherCoach);
//    }

}
