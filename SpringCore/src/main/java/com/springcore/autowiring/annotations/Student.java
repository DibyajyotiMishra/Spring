package com.springcore.autowiring.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
    @Autowired
    @Qualifier("subject2")
    private Subject subject;

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
