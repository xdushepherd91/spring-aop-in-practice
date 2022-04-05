package com.xdushepherd.spring.aop.introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wangqianyi03
 * @date 2022/4/3 22:35
 */
public class AnnotationMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext("com.xdushepherd");

        Person person = annotationConfigApplicationContext.getBean("person", Person.class);
        person.printSelf();
    }
}
