package com.springBoot.Learning1.CoreDemo.config;

import com.springBoot.Learning1.CoreDemo.common.Coach;
import com.springBoot.Learning1.CoreDemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportsConfig {

    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
