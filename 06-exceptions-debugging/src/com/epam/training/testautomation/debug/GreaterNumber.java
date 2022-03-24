package com.epam.training.testautomation.debug;

public class GreaterNumber {

    /**
     * Returns the greater positive one of the 2 parametered integers.
     * @return the greater positive number, 0 if both of them are non-positive
     */
    private static int getTheGrearPositiveNumber(int number1, int number2) {
        if (number1 <= 0 || number2 <= 0) {
            System.out.println("Not both of them were positive numbers.");
        }

        int greaterOne = number1 > number2 ? number1 : number2;

        return greaterOne > 0 ? greaterOne : 0;
    }

    public static void main(String... args) {
        System.out.println("Is 1 or 2 the greater positive number? " + getTheGrearPositiveNumber(1 ,2) + "\n");

        System.out.println("Is 0 or 1 the greater positive number? " + getTheGrearPositiveNumber(0 ,1) + "\n");
        // Why does it print the informational message before the question?
    }
}
