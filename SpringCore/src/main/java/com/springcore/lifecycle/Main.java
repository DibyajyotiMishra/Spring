package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("classpath*:lifecycle-config.xml");
        context.registerShutdownHook();

//        Food food = (Food) context.getBean("food");
//        System.out.println(food);
//
//        Animal animal = (Animal) context.getBean("animal");
//        System.out.println(animal);

        Language language = (Language) context.getBean("lang");
        System.out.println(language);
    }
}
