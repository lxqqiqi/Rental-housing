package com.example.testwindoshello.controller;


import com.example.testwindoshello.model.Status;
import com.example.testwindoshello.version.ApiVersion;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//两个错误1一但名字一样会无法分辨那个版本导致出错
//2postman请求之后返回的中文会乱码
@ApiVersion(1)
@RestController
@RequestMapping("{version}/hello")
public class TestVersion1Controller {
    @RequestMapping("/test")
    public Status Test() {
        System.out.println("版本1");
        Status status = new Status();
        status.setCode(1);
        status.setMessage("版本1");
        return status;
    }
}
