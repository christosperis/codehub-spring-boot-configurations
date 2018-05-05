package com.codehub.spring.core.service;

public class GreetingServiceEnglishImpl implements GreetingService {

    private static final String HELLO_CODE_HUB = "Hello Code.Hub!";

    @Override
    public String sayGreeting() {
        return HELLO_CODE_HUB;
    }
}
