package com.example.testwindoshello.controller;

import com.example.testwindoshello.interceptor.WebExceptionAspectGetMapper;
import com.example.testwindoshello.model.AuthorizeIn;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@CrossOrigin
@RequestMapping("/Test")
public class TestController {
    @RequestMapping("/c")
    public Integer Test(String a) {
        Integer b = Integer.valueOf(a);
       return b;
    }

    @GetMapping("/a")
    public AuthorizeIn TestA(@Valid AuthorizeIn authorize, BindingResult ret) {
        WebExceptionAspectGetMapper webExceptionAspectGetMapper = new WebExceptionAspectGetMapper();
        webExceptionAspectGetMapper.validate(ret);
        return authorize;
    }
    @RequestMapping("Hello")
    public String Hello() {
        return "ddd";
    }

}
