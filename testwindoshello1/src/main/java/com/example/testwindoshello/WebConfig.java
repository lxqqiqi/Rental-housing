package com.example.testwindoshello;

import com.example.testwindoshello.version.CustomRequestMappingHandlerMapping;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 *
 */
//配置类
//bean 注入、配置、拦截器注入等都放在这个类里面。
@SpringBootConfiguration
public class WebConfig extends WebMvcConfigurationSupport {
    //注意重写方法名字
    @Override
    public RequestMappingHandlerMapping requestMappingHandlerMapping() {
        RequestMappingHandlerMapping handlerMapping = new CustomRequestMappingHandlerMapping();
        handlerMapping.setOrder(0);
        return  handlerMapping;
    }
}
