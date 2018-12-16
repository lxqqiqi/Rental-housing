package com.example.testwindoshello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableEurekaClient

@EnableJpaRepositories
public class TestwindoshelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestwindoshelloApplication.class, args);
    }
}
