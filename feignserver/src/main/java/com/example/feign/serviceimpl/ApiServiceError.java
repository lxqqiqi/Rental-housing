package com.example.feign.serviceimpl;

import com.example.feign.service.ApiService;
import org.springframework.stereotype.Component;

@Component
public class ApiServiceError implements ApiService {

    @Override
    public String index() {
        return "服务器发生故障了，快去通知管理员3";
    }
}
