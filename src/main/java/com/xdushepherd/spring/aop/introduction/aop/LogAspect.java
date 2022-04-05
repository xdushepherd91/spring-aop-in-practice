package com.xdushepherd.spring.aop.introduction.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author wangqianyi03
 * @date 2022/4/3 23:01
 */
@Aspect
@Component
public class LogAspect {

    @Pointcut("execution(public * *(..))")
    public void allMethodPointCut() {}

    @Around("target(com.xdushepherd.spring.aop.getting.startted.Person)")
    public Object aroundJoinPoint(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("before execute");
        Object proceed = pjp.proceed();
        System.out.println("end execute");

        return proceed;

    }
}