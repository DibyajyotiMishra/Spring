package com.springcore.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

    private Subject subject;

    @Autowired
    public Student(Subject subject) {
        this.subject = subject;
    }

    public Student() {
        super();
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Student{" +
                 subject +
                '}';
    }
}
