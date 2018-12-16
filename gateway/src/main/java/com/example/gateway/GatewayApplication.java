package com.example.gateway;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class GatewayApplication {
    private static Logger logger = LoggerFactory.getLogger(GatewayApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
}
