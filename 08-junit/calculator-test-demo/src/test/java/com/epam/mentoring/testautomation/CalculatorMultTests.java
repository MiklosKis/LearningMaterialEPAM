package com.epam.mentoring.testautomation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorMultTests {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testSixTimesTwoIsTwelve() {
        int expectedResult = 12;
        int actualResult = calculator.mult(6, 2).calculate();
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testNineTimesZeroIsZero() {
        int expectedResult = 0;
        int actualResult = calculator.mult(9, 0).calculate();
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFourTimesMinusThreeIsMinusTwelve() {
        int expectedResult = -12;
        int actualResult = calculator.mult(4, -3).calculate();
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinusOneTimesMinusOneIsPlusOne() {
        int expectedResult = 1;
        int actualResult = calculator.mult(-1, -1).calculate();
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFiveTimesSixIsNotTwenty() {
        int expectedResult = 20;
        int actualResult = calculator.mult(6, 4).calculate();
        Assertions.assertNotEquals(expectedResult, actualResult);
    }

    @AfterEach
    public void teardown() {
        System.out.println("The actual result of the calculation is: " + calculator.calculate());
    }
}
