package com.springcore.noxml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.springcore.noxml")
public class Config {

    @Bean
    public University getUniversity() {
        return new University();
    }

    @Bean(name = {"student"})
    public Student getStudent() {
        Student student = new Student(getUniversity());
        return student;
    }
}
