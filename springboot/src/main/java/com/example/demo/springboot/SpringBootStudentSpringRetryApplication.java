package com.example.demo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@EnableRetry
public class SpringBootStudentSpringRetryApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootStudentSpringRetryApplication.class, args);
    }
}
