package com.example.UdemyChaapter1.MyCoolApp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @Value("${coach.name}")
    private String coach;
    @Value("${team.name}")
    private String team;

    //Expose an endpoint "/" which returns hello world
    @GetMapping("/h")
    public String sayHello(){
        return "Hello World";
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5K!";
    }

    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return "Coach : " +  coach + ", Team : " + team;
    }

    @GetMapping("/fortune")
    public String getFortune(){
        return "It's your lucky day bitch, enjoy cocksucking MotherFucker!";
    }
}
