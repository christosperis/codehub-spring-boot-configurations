package com.codehub.spring.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import com.codehub.spring.core.controller.ConstructorInjectedController;
import com.codehub.spring.core.controller.SetterInjectedController;
import com.codehub.spring.core.service.GreetingServiceImpl;

@Configuration
public class AppConfig {

    @Bean
    GreetingServiceImpl getGreetingService() {
        return new GreetingServiceImpl();
    }

    @Bean
    @Lazy
    ConstructorInjectedController getConstructorInjectedController() {
        return new ConstructorInjectedController(getGreetingService());
    }

    @Bean
    SetterInjectedController getSetterInjectedController() {
        SetterInjectedController setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingService(getGreetingService());
        return setterInjectedController;
    }

}
