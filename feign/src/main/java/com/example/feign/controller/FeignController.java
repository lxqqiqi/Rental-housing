package com.example.feign.controller;

import com.example.feign.service.ApiService;
import com.example.feign.service.TestHello1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//测试hystrix熔断器
@RestController
@CrossOrigin
@RequestMapping("/hystrix")
public class FeignController {
    @Autowired
    private ApiService apiService;

    @Autowired
    private TestHello1Service testHello1Service;

    @RequestMapping("/index")
    public String index() {
        return  apiService.index();
    }

    @RequestMapping("/test1")
    public  String test1() {
        return  apiService.test1();
    }

    @RequestMapping("/hello1")
    public  String hello1(){
        return  testHello1Service.index();
    }
}
