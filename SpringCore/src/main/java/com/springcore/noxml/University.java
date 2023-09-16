package com.springcore.noxml;

import org.springframework.beans.factory.annotation.Value;

public class University {

    @Value("Amrita Viswa Vidyapeetham")
    private String name;

    public University() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                '}';
    }
}
