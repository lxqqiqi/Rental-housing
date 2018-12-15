package com.example.feign.controller;

import com.example.feign.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//测试hystrix熔断器
@RestController
@CrossOrigin
@RequestMapping("/hystrixs")
public class FeignController {
    @Autowired
    private ApiService apiService;

    @RequestMapping("/index")
    public String index() {
        return  apiService.index();
    }

}
