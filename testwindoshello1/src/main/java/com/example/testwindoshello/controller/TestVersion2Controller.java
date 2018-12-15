package com.example.testwindoshello.controller;


import com.example.testwindoshello.model.Status;
import com.example.testwindoshello.version.ApiVersion;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@ApiVersion(2)
@RestController
@RequestMapping("{version}/hello")
public class TestVersion2Controller {
    @RequestMapping("/test")
    public Status Test() {
        System.out.println("版本2");
        Status status = new Status();
        status.setCode(1);
        status.setMessage("版本2");
        return status;
    }
}
