package com.springcore.noxml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Student {

    @Value("Dibyajyoti Mishra")
    private String name;

    @Value("23")
    private int age;

    private University university;


    public Student(University university) {
        super();
        this.university = university;
    }

    public Student() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age + '\'' + ", " + university + '\'' +
                '}';
    }
}
