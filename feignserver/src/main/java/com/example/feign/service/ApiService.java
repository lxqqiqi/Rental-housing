package com.example.feign.service;

import com.example.feign.serviceimpl.ApiServiceError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//注解配置要调用的服务地址
//实现了熔断器之后可是要记得制定fallback
//回调类标签
@FeignClient(value = "feign",fallback = ApiServiceError.class)
public interface ApiService {
    @RequestMapping(value = "hystrix/index",method = RequestMethod.GET)
    String index();

}

