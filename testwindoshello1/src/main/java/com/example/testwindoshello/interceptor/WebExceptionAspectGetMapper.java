package com.example.testwindoshello.interceptor;


import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.codehaus.plexus.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@Aspect
@Component
public class WebExceptionAspectGetMapper implements ThrowsAdvice {
    public static final Logger logger = LoggerFactory.getLogger(WebExceptionAspectGetMapper.class);
    //拦截被GetMapping注解的方法
    @Pointcut("@annotation(org.springframework.web.bind.annotation.GetMapping)")
    private void webPointcut() {
    }

    @AfterThrowing(pointcut = "webPointcut()", throwing = "e")
    public void afterThrowing(Exception e) throws Throwable {
        //日志级别低于debug才能输出
        logger.debug("exception 来了!");
        //判断e.getMessage()不为空
        if (StringUtils.isNotBlank(e.getMessage())) {
            //不为空输出异常的异常信息
            weiteContent(e.getMessage());
        } else {
            weiteContent("参数错误");
        }
    }

    /**
     * 将内容输出到浏览器
     *
     * @param content 输出内容
     */
    private void weiteContent(String content) {
        HttpServletResponse response;
        response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
        response.reset();
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Content-Type","text/plain;charset=UTF-8");
        response.setHeader("icop-content-type","exception");
        PrintWriter writer = null;
        try{
            writer = response.getWriter();
            //等于下面加的错误两个字无效
//            writer.print((content==null)?"":"错误" + content);
            writer.print((content==null)?"":content);
            writer.flush();
            writer.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void  validate(BindingResult result) {
        if(result.hasFieldErrors()) {
            List<FieldError> errorList = result.getFieldErrors();
            errorList.stream().forEach(item-> Assert.isTrue(false,item.getDefaultMessage()));
        }
    }
}
