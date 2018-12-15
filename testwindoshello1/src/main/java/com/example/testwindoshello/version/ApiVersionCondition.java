package com.example.testwindoshello.version;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.mvc.condition.RequestCondition;

import javax.servlet.http.HttpServletRequest;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApiVersionCondition implements RequestCondition<ApiVersionCondition> {
    //路径中版本的前缀，这里用/v[1-9]/的形式
    private  final  static Pattern VERSION_PREFIX_PATTERN=Pattern.compile("v(\\d+)/");

    private  int apiVersion;

    public ApiVersionCondition(int apiVersion) {
        this.apiVersion = apiVersion;
        System.out.println("版本信息" + apiVersion);
    }

    /**
     * 将不同的筛选条件合并
     * @param apiVersionCondition
     * @return
     */
    @Override
    public ApiVersionCondition combine(ApiVersionCondition apiVersionCondition) {
        //采用最后定义优先原则，则方法上的定义覆盖类上面的定义
        return new ApiVersionCondition(apiVersionCondition.getApiVersion());
    }

    /**
     * 根据request查找匹配到的筛选条件
     * @param httpServletRequest
     * @return
     */
    @Nullable
    @Override
    public ApiVersionCondition getMatchingCondition(HttpServletRequest httpServletRequest) {
//        Matcher正则表达式所订制的类
        //可能是查找出httpServletRequest里面的RequestURI拿去经过VERSION_PREFIX_PATTERN的matcher方法转化成Matcher类
        Matcher m = VERSION_PREFIX_PATTERN.matcher(httpServletRequest.getRequestURI());
        if(m.find()) {
            //group是针对（）来说的，group（0）就是指的整个串，group（1） 指的是第一个括号里的东西，group（2）指的第二个括号里的东西。
            Integer version = Integer.valueOf(m.group(1));
            if(version>=this.apiVersion) {
                return  this;
            }
        }
        return null;
    }

    /**
     * 不同筛选条件比较，用于排序
     * @param apiVersionCondition
     * @param httpServletRequest
     * @return
     */
    @Override
    public int compareTo(ApiVersionCondition apiVersionCondition, HttpServletRequest httpServletRequest) {
        //优先匹配最新的版本号
        return apiVersionCondition.getApiVersion() - this.apiVersion;
    }


    public int getApiVersion() {
        return apiVersion;
    }
}
