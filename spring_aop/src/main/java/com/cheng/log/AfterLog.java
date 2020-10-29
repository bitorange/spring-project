package com.cheng.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterLog implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) {
        System.out.println(o1.getClass().getName()+"执行了"+method.getName()+"方法，返回结果为"+o);
    }
}
