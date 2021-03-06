package com.crsardar.bdd.java.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.crsardar.bdd"})
@SpringBootApplication
public class SpringApp {

    public static void main(String[] args) {

        SpringApplication.run(SpringApp.class, args);
    }
}
