package com.codehub.spring.core.service;

public class GreetingServiceGreekImpl implements GreetingService {

    private static final String HELLO_CODE_HUB = "Γειά σας Code.Hub!";

    @Override
    public String sayGreeting() {
        return HELLO_CODE_HUB;
    }
}
