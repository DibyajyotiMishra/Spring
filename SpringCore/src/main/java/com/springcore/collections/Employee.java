package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
    private String name;
    private Set<String> phoneNumbers;
    private List<String> address;
    private Map<String, String> courses;
    private Properties props;

    public Employee(String name, Set<String> phoneNumbers, List<String> address, Map<String, String> courses, Properties props) {
        this.name = name;
        this.phoneNumbers = phoneNumbers;
        this.address = address;
        this.courses = courses;
        this.props = props;
    }

    public Employee() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(Set<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public Properties getProps() {
        return props;
    }

    public void setProps(Properties props) {
        this.props = props;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                ", address=" + address +
                ", courses=" + courses +
                ", props=" + props +
                '}';
    }
}
