package com.epam.mentoring.testautomation;

public class Calculator {
    private int result;

    public Calculator() {
    }

    public Calculator add(int firstNumber) {
        this.result += firstNumber;
        return this;
    }

    public Calculator add(int firstNumber, int secondNumber) {
        this.result = firstNumber + secondNumber;
        return this;
    }

    public Calculator sub(int firstNumber) {
        this.result -= firstNumber;
        return this;
    }

    public Calculator sub(int firstNumber, int secondNumber) {
        this.result = firstNumber - secondNumber;
        return this;
    }

    public Calculator mult(int firstNumber) {
        this.result *= firstNumber;
        return this;
    }

    public Calculator mult(int firstNumber, int secondNumber) {
        this.result = firstNumber * secondNumber;
        return this;
    }

    public Calculator div(int firstNumber) {
        this.result /= firstNumber;
        return this;
    }

    public Calculator div(int firstNumber, int secondNumber) {
        this.result = firstNumber / secondNumber;
        return this;
    }

    public int calculate() {
        return this.result;
    }
}
