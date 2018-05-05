package com.codehub.spring.core.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.codehub.spring.core.service.GreetingService;

//This annotation is needed to tell spring that this is a bean
@Controller
public class AutowiredInjectedController {

    //We need this annotation here to know where to Autowire
    @Autowired
    private List<GreetingService> greetingServiceList;

    @Autowired
    private Set<GreetingService> greetingServiceSet;

    @Autowired
    private Map<String, GreetingService> greetingServiceMap;

    public String sayHello() {
        greetingServiceList.forEach(service -> System.out.println(service.getClass().getName()));
        greetingServiceSet.forEach(service -> System.out.println(service.getClass().getName()));
        greetingServiceMap.keySet().forEach(s -> System.out.println(s));
        return greetingServiceList.get(0).sayGreeting();
    }

}
