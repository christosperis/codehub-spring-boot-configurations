package com.codehub.spring.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.codehub.spring.core.controller.AutowiredInjectedController;
import com.codehub.spring.core.controller.ConstructorInjectedController;
import com.codehub.spring.core.controller.SetterInjectedController;

@SpringBootApplication
public class SpringConfigCodeExamplesApplication {

    public static void main(String[] args) {


        ApplicationContext ctx = SpringApplication.run(SpringConfigCodeExamplesApplication.class, args);

        System.out.println(ctx.getBean(AutowiredInjectedController.class).sayHello());
        System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
        System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
    }
}
