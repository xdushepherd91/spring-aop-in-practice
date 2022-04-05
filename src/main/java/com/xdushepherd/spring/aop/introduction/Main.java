package com.xdushepherd.spring.aop.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wangqianyi03
 * @date 2022/4/3 22:20
 */
public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");

        Person person = applicationContext.getBean("person", Person.class);
        System.out.println(person);
    }
}
