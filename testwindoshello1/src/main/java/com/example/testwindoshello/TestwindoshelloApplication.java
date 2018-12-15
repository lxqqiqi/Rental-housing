package com.example.testwindoshello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TestwindoshelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestwindoshelloApplication.class, args);
    }
}
