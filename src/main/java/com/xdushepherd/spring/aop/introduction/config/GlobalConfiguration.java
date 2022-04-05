package com.xdushepherd.spring.aop.introduction.config;


import com.xdushepherd.spring.aop.introduction.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author wangqianyi03
 * @date 2022/4/3 22:40
 */
@Configuration
@EnableAspectJAutoProxy
public class GlobalConfiguration {

    @Bean(name = "person")
    public Person createPerson() {
        return new Person("王千一", 12);
    }
}
