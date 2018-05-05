package com.codehub.spring.core.controller;

import javax.annotation.PostConstruct;

import com.codehub.spring.core.service.GreetingService;


//This annotation is needed to tell spring that this is a bean
public class ConstructorInjectedController {

    private GreetingService greetingService;

    @PostConstruct
    private void initialize() {
        System.out.println("Lazy bean constructed");
    }

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        System.out.println("Lazy bean method called");
        return greetingService.sayGreeting();
    }
}
