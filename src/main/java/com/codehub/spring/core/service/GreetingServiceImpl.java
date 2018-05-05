package com.codehub.spring.core.service;

//This annotation is needed to tell spring that this is a bean
public class GreetingServiceImpl implements GreetingService {

    private static final String HELLO_CODE_HUB = "Hello Code.Hub!";

    @Override
    public String sayGreeting() {
        return HELLO_CODE_HUB;
    }
}
