package com.epam.mentoring.testautomation;

import org.junit.jupiter.api.*;

public class CalculatorDivTests {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testTenDivFiveIsTwo() {
        int expectedResult = 2;
        int actualResult = calculator.div(10, 5).calculate();
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testZeroDivFiveIsZero() {
        int expectedResult = 0;
        int actualResult = calculator.div(0, 5).calculate();
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFiveDivTwoIsTwoCommaFive() {
        double expectedResult = 2.5D;
        int actualResult = calculator.div(5, 2).calculate();
        Assertions.assertEquals(expectedResult, actualResult, 1.0D);
    }

    @AfterEach
    public void teardown() {
        System.out.println("The actual result of the calculation is: " + calculator.calculate());
    }
}
