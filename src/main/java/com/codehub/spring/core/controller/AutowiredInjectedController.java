package com.codehub.spring.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.codehub.spring.core.service.GreetingServiceGreekImpl;

//This annotation is needed to tell spring that this is a bean
@Controller
public class AutowiredInjectedController {

    //We need this annotation here to know where to Autowire
    @Autowired(required = false)
    private GreetingServiceGreekImpl greetingServiceGreekImpl;

    public String sayHello() {
        if (greetingServiceGreekImpl != null) {
        return greetingServiceGreekImpl.sayGreeting();
    } else
        return "Bean is not required";
    }

}
