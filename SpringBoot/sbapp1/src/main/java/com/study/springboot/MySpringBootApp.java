package com.study.springboot;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class MySpringBootApp {

    public static void main(String[] args) {
        System.out.println("Hello World!!! Welcome to the world of spring boot....");
        SpringApplication.run(MySpringBootApp.class, args);
    }

    /*
    CommandLineRunner method marked as a @Bean and this runs on start up.
    It retrieves all the beans that were created either by your app or were automatically added thanks to Spring Boot. It sorts them and prints them out.
    */

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext context) {
        return val -> {
            System.out.println("Lets inspect Spring Boot's bean");
            String[] beanNames = context.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }
        };
    }
}
