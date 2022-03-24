package com.epam.training.testautomation.exceptions;

public class NumberDivider {

    private int divideWithExceptionHandling(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException exc) {
            System.out.println("The 2nd parameter must not be zero.");
        }

        return 0;
    }

    /**
     * Divides a by b and returns the whole part of the result.
     * @param a the number you want to divide by the 2nd parameter
     * @param b the number you want to divide the 1st parameter with
     * @return the whole part of the result as int
     * @throws InvalidDivideException if the 2nd parameter is 0
     */
    private int divideWithThrowingException(int a, int b) throws InvalidDivideException {
        if (b == 0) {
            throw new InvalidDivideException("The second parameter must not be zero.");
        } else {
            return a / b;
        }
    }

    private int divideWithoutAnyExceptionHandling(int a, int b) {
        return a / b;
    }

    public static void main(String... args) {
        NumberDivider divider = new NumberDivider();

//        System.out.print("1.: Dividing 5 by 3 with divideWithExceptionHandling: ");
//        System.out.println(divider.divideWithExceptionHandling(5, 3));

//        System.out.println();
//        System.out.print("2.: Dividing 6 by 0 with divideWithExceptionHandling: ");
//        System.out.println(divider.divideWithExceptionHandling(6, 0));

//        try {
//            System.out.println();
//            System.out.print("3.: Dividing 5 by 3 with divideWithThrowingException: ");
//            int asd = divider.divideWithThrowingException(5, 3);
//            System.out.println(asd);
//        } catch (InvalidDivideException e) {
//            e.printStackTrace();
//        }

//        try {
//            System.out.println();
//            System.out.print("4.: Dividing 6 by 0 with divideWithThrowingException: ");
//            int fgh = divider.divideWithThrowingException(6, 0);
//            System.out.println(fgh);
//        } catch (InvalidDivideException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println();
//        System.out.print("5.: Dividing 4 by 3 with divideWithoutAnyExceptionHandling: ");
//        System.out.println(divider.divideWithoutAnyExceptionHandling(4, 3));
//
//        System.out.println();
//        System.out.print("6.: Dividing 6 by 0 with divideWithoutAnyExceptionHandling: ");
//        System.out.println(divider.divideWithoutAnyExceptionHandling(6, 0));
//        System.out.println();

//        System.out.println("7.: This line won't be printed because the thrown exception at 6th dividing was not handled anyhow.");
        // Imagine there are hundreds of valuable code lines here. None of them will be executed.
    }
}
