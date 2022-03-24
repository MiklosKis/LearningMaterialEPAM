package com.epam.tam;


import java.util.Map;

public class Person {
    private String name;
    private Map<String, String> phoneNumbers;
    private String city;

    public String getName() {
        return name;
    }

    public Map<String, String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                ", city='" + city + '\'' +
                '}';
    }
}
