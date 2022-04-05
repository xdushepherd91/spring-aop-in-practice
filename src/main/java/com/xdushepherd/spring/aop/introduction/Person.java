package com.xdushepherd.spring.aop.introduction;

/**
 * @author wangqianyi03
 * @date 2022/4/3 22:20
 */
public class Person {

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void printSelf() {
        System.out.println(this.toString());
    }
}
