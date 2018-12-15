package com.example.testwindoshello.interceptor;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.jboss.logging.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 对RequestMapping进行拦截如果出错返回错误信息
 */

@Aspect
@Component
public class WebExceptionAspect {
    private  static  final Logger logger = Logger.getLogger(WebExceptionAspect.class);
    //凡是注解了RequestMapping的方法都会被拦截  @Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
    @Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
    private  void  webPointcut() {
    }


    /**
     * 拦截web层异常，记录异常日志，并返回友好信息到前端，目前只拦截Exception是否要拦截Error需在考虑
     *
     * @param  e
     *  异常对象
     */
    @AfterThrowing(pointcut="webPointcut()",throwing = "e")
    public void handleThrowing(Exception e) {
        e.printStackTrace();
        logger.error("发现异常!" + e.getMessage());
        //logger.error(JSONUtils.toJSONString(e.getStackTrace()));这句无效开启的话下面的不会执行不是很懂原因
//        logger.error(JSONUtils.toJSONString(e.getStackTrace()));
        //这句没有问题应该是JSONUtils的问题
//        logger.error("出现异常了" + e.getStackTrace());
        //在这里输入友好性信息
        writeContents("出现异常");
    }

    /**
     * 将内容输出到浏览器
     *
     * @param content
     *  输出内存
     */
    private  void writeContents(String content) {

        HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
        response.reset();
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Content-Type","text/plain;charset=UTF-8");
//        response.setHeader("icop-content-type","exception");
        PrintWriter writer = null;
        try {
//            getWriter方法将Servlet引擎的数据缓冲区包装成PrintWriter类型的字符输出流对象后返回，PrintWriter对象可以直接输出字符文本内容
            writer = response.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.print(content);
        //证明可以输出多条
//       writer.print("肯定是你做的");
        writer.flush();
        writer.close();
    }
}
