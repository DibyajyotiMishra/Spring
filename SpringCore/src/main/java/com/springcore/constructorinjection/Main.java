package com.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:constructor-config.xml");
        Person person = (Person) context.getBean("person");
        System.out.println(person);

        Add add = (Add) context.getBean("add");
        add.sum();
    }
}
