package com.epam.training.testautomation.debug;

public class Customer {

    private String name;
    private int age;

    private Customer(String name) {
        this.name = name;
    }

    private Customer(String name, int age) {
        this.age = age;
    }

    private boolean isNameContainingE() {
        return name.toUpperCase().contains("E");
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String... args) {
        Customer newBorn = new Customer("Michelle");
        System.out.println("newBorn.isNameContainingE() = " + newBorn.isNameContainingE());

        System.out.println();

        Customer joey = new Customer("Joey", 32);
        System.out.println("joey.isNameContainingE() = " + joey.isNameContainingE());
        // Why does it throw NullPointerException (NPE)?
    }
}
