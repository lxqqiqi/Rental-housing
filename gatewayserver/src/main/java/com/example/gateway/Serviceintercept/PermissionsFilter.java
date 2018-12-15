package com.example.gateway.Serviceintercept;


import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Component
public class PermissionsFilter extends ZuulFilter {


    public String filterType() {
        return "route";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        //共享RequestContext，上下文对象
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
//在控制台打印访问的路径
        System.out.println(request.getRequestURI());
        TypeCode typeCode = new TypeCode();

        int type = typeCode.getType();
        if(type==0) {
            return false;
        } else {

            //需要权限校验URL
            if ("/balance/hello/hello/test".equalsIgnoreCase(request.getRequestURI())) {
                return true;
//        } else if ("/apigateway/order/api/v1/order/list".equalsIgnoreCase(request.getRequestURI())) {
//            return true;
//        } else if ("/apigateway/order/api/v1/order/find".equalsIgnoreCase(request.getRequestURI())) {
//            return true;
            }
            return false;
        }
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext context = RequestContext.getCurrentContext();
//        HttpServletRequest request = context.getRequest();
//        String name = request.getHeader("name");

        int a = 0;
        if(a<1) {
            //false代表的意思是,这个请求最终不会被zuul转发到后端服务器
            context.setSendZuulResponse(false);
            context.setResponseStatusCode(401);
            try {
                context.getResponse().getWriter().write("Does not have the permission");
            } catch (Exception e) {}
        }
        return null;
    }
}
