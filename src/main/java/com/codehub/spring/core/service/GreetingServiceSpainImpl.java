package com.codehub.spring.core.service;

import org.springframework.stereotype.Service;

//This annotation is needed to tell spring that this is a bean
@Service
public class GreetingServiceSpainImpl implements GreetingService {

    private static final String HELLO_CODE_HUB = "Hola Code.Hub!";

    @Override
    public String sayGreeting() {
        return HELLO_CODE_HUB;
    }
}
