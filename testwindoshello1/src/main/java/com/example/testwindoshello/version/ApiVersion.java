package com.example.testwindoshello.version;

import org.springframework.web.bind.annotation.Mapping;

import java.lang.annotation.*;


@Target({ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Mapping
//记得先加interface噢否则的话上面标签全部报错- -很尴尬
public @interface ApiVersion {
    int value();
}
