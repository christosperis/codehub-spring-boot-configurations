package com.codehub.spring.core.controller;

import javax.annotation.PostConstruct;

import com.codehub.spring.core.service.GreetingService;


//This annotation is needed to tell spring that this is a bean
public class SetterInjectedController {
    private GreetingService greetingService;

    @PostConstruct
    public void init() {
        System.out.println("Not Lazy bean constructed");
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
