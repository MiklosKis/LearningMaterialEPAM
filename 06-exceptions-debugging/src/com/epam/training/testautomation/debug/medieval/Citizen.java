package com.epam.training.testautomation.debug.medieval;

public class Citizen {
    private String name;

    Citizen(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "name='" + name + '\'' +
                '}';
    }
}
