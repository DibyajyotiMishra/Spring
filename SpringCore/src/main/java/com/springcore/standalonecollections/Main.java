package com.springcore.standalonecollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:standalone-config.xml");
        Person person = context.getBean("person", Person.class);
        System.out.println(person);
    }
}
