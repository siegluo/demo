package com.example.demo.squirrel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.demo.squirrel")
public class DemoSquirrelApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSquirrelApplication.class, args);
    }

}
