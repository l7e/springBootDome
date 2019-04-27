package com.like.interecptor;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//使用注解代替下面的的实例化slf4j方式
@Slf4j
public class MyInterceptor implements HandlerInterceptor
{
    //使用slf4j日志
//    private static final Logger log = LoggerFactory.getLogger(MyInterceptor.class); //传入类

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception
    {
        log.debug("preHandle running");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception
    {
        log.debug("postHandle running");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception
    {
        log.debug("afterCompletion running");
    }
}
