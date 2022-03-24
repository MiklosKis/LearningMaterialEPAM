package com.epam.mentoring.testautomation;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2).add(4).add(3, 4).calculate());
        Calculator calculator2 = new Calculator();
        System.out.println(calculator2.div(2, 1).add(45).sub(12).calculate());
        Calculator calculator3 = new Calculator();
        int actualResult = calculator3.add(3, 3).calculate();
        int expectedResult = 6;
        int expectedFalse = 5;
        System.out.println(myValidator(expectedResult, actualResult) + "");
        System.out.println(myValidator(expectedFalse, actualResult) + "");
    }

    public static boolean myValidator(int expected, int actual) {
        return expected == actual;
    }
}
