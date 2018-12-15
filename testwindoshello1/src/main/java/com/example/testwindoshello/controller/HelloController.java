package com.example.testwindoshello.controller;

import com.example.testwindoshello.model.Preventsql;
import com.example.testwindoshello.model.Status;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/hello")
@Slf4j
public class HelloController {
    @Value("${server.port}")
    private int port;

    Preventsql preventsql = new Preventsql();

    @RequestMapping("/test")
    public Status test() {
        Status status = new Status();
        status.setCode(port);
        status.setMessage("Hello");
        return status;
    }

    @RequestMapping("/test1")
    public Status test1() {
        Status status = new Status();
        status.setCode(port);
        status.setMessage("Test1");
        return status;
    }

    @RequestMapping("/preventsql")
    public String test2(String a) {

        String str = preventsql.sqlValidate(a);
        return str;
    }
}