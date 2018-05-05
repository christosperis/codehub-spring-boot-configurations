package com.codehub.spring.core.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import com.codehub.spring.core.service.GreetingService;
import com.codehub.spring.core.service.GreetingServiceEnglishImpl;
import com.codehub.spring.core.service.GreetingServiceGreekImpl;

@Configuration
public class AppConfig {

    @Bean
    @Conditional(EnglishLocaleConditional.class)
    GreetingService getGreetingServiceEnglish() {
        return new GreetingServiceEnglishImpl();
    }

    @Bean
    @Conditional(GreekLocaleConditional.class)
    GreetingService getGreetingServiceGreek() {
        return new GreetingServiceGreekImpl();
    }
}
