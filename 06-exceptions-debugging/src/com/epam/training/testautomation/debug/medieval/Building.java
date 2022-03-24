package com.epam.training.testautomation.debug.medieval;

public class Building {
    private String name;
    private String type;
    private Citizen owner;

    Building(String name, String type, Citizen owner) {
        this.name = name;
        this.type = type;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Building{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", owner=" + owner +
                '}';
    }
}