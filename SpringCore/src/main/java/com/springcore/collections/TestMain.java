package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:collection-config.xml");
        Employee employee = (Employee) context.getBean("employee1");
        System.out.println(employee);

    }
}
