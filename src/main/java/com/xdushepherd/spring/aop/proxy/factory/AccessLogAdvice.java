package com.xdushepherd.spring.aop.proxy.factory;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * @author wangqianyi03
 * @date 2022/4/5 16:43
 */
public class AccessLogAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(1111);
    }
}
