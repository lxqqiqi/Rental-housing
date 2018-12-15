package com.example.feign.service;

import com.example.feign.serviceimpl.TestHelloServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "hello1",fallback = TestHelloServiceImpl.class)
public interface TestHello1Service {
        @RequestMapping(value = "hello1/test",method = RequestMethod.GET)
        String index();
}
