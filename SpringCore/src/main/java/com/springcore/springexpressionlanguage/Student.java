package com.springcore.springexpressionlanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Student {
    @Value("Dibyajyoti Mishra")
    private String name;

    @Value("#{new java.lang.String(\"Mishra\")}")
    private String lastName;

    @Value("Balasore")
    private String city;

    @Value("#{phone}")
    private List<String> phone;

    @Value("23")
    private int age;

    @Value("#{student.getAge() > 18}")
    private boolean isAdult;


    public Student() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getPhone() {
        return phone;
    }

    public void setPhone(List<String> phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdult() {
        return isAdult;
    }

    public void setAdult(boolean adult) {
        isAdult = adult;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                "lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", phone=" + phone + '\'' +
                ", age='" + age + '\'' +
                ", isAdult='" + isAdult + '\'' +
                '}';
    }
}
