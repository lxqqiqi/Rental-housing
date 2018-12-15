package com.example.feign.serviceimpl;

import com.example.feign.service.TestHello1Service;
import org.springframework.stereotype.Component;

@Component
public class TestHelloServiceImpl implements TestHello1Service {
    @Override
    public String index() {
        return "Hello1故障1";
    }
}
