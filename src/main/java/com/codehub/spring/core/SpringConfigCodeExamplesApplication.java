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

        System.out.println("Spring Context is Initialized!");

        AutowiredInjectedController autowiredInjectedController = ctx.getBean(AutowiredInjectedController.class);
        System.out.println(autowiredInjectedController.sayHello());

        ConstructorInjectedController constructorInjectedController = ctx.getBean(ConstructorInjectedController.class);
        System.out.println(constructorInjectedController.sayHello());

        SetterInjectedController setterInjectedController = ctx.getBean(SetterInjectedController.class);
        System.out.println(setterInjectedController.sayHello());
    }
}
