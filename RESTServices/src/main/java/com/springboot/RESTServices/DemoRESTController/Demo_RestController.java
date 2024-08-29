package com.springboot.RESTServices.DemoRESTController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Demo_RestController {

    @GetMapping("/hello")
    public String sayHello(){
        return "Hello Fuckin World!";
    }


}
