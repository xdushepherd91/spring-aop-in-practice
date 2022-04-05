package com.xdushepherd.spring.aop.factory.bean;

import com.xdushepherd.spring.aop.introduction.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wangqianyi03
 * @date 2022/4/5 20:30
 */
public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
        DoSomeServiceImpl proxyFactory = applicationContext.getBean("proxyFactoryBean", DoSomeServiceImpl.class);
        proxyFactory.doSome();
        proxyFactory.doSome2();
    }
}
