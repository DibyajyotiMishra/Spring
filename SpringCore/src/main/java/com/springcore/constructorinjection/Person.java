package com.springcore.constructorinjection;

import java.util.List;

public class Person {
    private int personId;
    private String name;

    private Certificate certificate;

    private List<String> phoneNumber;

    public Person(int personId, String name, Certificate certificate, List<String> phoneNumber) {
        this.personId = personId;
        this.name = name;
        this.certificate = certificate;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", name='" + name + '\'' +
                ", " + certificate + '\''+
                ", phoneNumbers='" + phoneNumber + '\'' +
                '}';
    }
}
