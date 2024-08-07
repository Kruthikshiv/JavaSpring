package com.example.UdemyChaapter1.MyCoolApp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    //Expose an endpoint "/" which returns hello world
    @GetMapping("/h")
    public String sayHello(){
        return "Hello World";
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5K!";
    }

    @GetMapping("/fortune")
    public String getFortune(){
        return "It's your lucky day bitch, enjoy cocksucking MotherFucker!";
    }
}
