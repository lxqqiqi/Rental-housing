package com.example.gateway.Serviceintercept;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class ApiFilter extends ZuulFilter {
    @Override
    //filterType 为过滤类型，可选值有 pre（路由之前）、routing（路由之时）、
    //post（路由之后）、error（发生错误时调用）。
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        //校检代码
        RequestContext context = RequestContext.getCurrentContext();
        HttpServletRequest request = context.getRequest();
        String token = request.getParameter("token");
//        if(!"12345".equals(token)) {
//            //false代表的意思是,这个请求最终不会被zuul转发到后端服务器
//            context.setSendZuulResponse(false);
//            context.setResponseStatusCode(401);
//            try {
//                context.getResponse().getWriter().write("token is invalid1");
//            } catch (Exception e) {}
//        }
        return null;
    }
}
