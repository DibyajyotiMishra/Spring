package com.springcore.standalonecollections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
    private List<String> friends;
    private Map<String, String> phone;

    private Properties properties;


    public Person() {
        super();
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public Map<String, String> getPhone() {
        return phone;
    }

    public void setPhone(Map<String, String> phone) {
        this.phone = phone;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Person{" +
                "friends=" + friends +
                ", phone=" + phone +
                ", properties=" + properties +
                '}';
    }
}
