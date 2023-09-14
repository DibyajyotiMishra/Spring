package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Language {
    private String name;

    public Language(String name) {
        this.name = name;
    }

    public Language() {
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
        return "Language{" +
                "name='" + name + '\'' +
                '}';
    }

    @PostConstruct
    public void initialise() {
        System.out.println("Initialising bean");
    }

    @PreDestroy
    public void kill() {
        System.out.println("Destroying bean");
    }
}
