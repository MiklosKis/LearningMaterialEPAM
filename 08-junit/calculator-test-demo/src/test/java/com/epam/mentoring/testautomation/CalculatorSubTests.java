package com.epam.mentoring.testautomation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorSubTests {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testTenMinusEightIsTwo() {
        int expectedResult = 2;
        int actualResult = calculator.sub(10, 8).calculate();
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testZeroMinusSevenIsMinusSeven() {
        int expectedResult = -7;
        int actualResult = calculator.sub(0, 7).calculate();
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSixMinusZeroIsSix() {
        int expectedResult = 6;
        int actualResult = calculator.sub(6, 0).calculate();
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testTenMinusFiveIsNotTwo() {
        int expectedResult = 2;
        int actualResult = calculator.sub(10, 5).calculate();
        Assertions.assertNotEquals(expectedResult, actualResult);
    }

    @AfterEach
    public void teardown() {
        System.out.println("The actual result of the calculation is: " + calculator.calculate());
    }
}
