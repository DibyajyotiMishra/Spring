package com.springcore.references;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReferencesMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:references-config.xml");
        ClassA a = (ClassA) context.getBean("aReference");
        System.out.println(a);
    }
}
