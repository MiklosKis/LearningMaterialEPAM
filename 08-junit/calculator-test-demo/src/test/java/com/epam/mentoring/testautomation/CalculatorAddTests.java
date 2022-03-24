package com.epam.mentoring.testautomation;

import org.junit.jupiter.api.*;

public class CalculatorAddTests {

    private Calculator calculator;

    @BeforeEach
    public void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void testFivePlusFiveIsTen(){
        int expectedResult = 10;
        int actualResult = calculator.add(5,5).calculate();
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testFivePlusZero(){
        int expectedResult = 5;
        int actualResult = calculator.add(5,0).calculate();
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testZeroPlusMinusFive(){
        int expectedResult = -5;
        int actualResult = calculator.add(0,-5).calculate();
        Assertions.assertEquals(expectedResult,actualResult);
    }

    @Test
    public void testOnePlusTwoIsNotFour(){
        int expectedResult = 4;
        int actualResult = calculator.add(1,2).calculate();
        Assertions.assertNotEquals(expectedResult, actualResult);
    }

    @AfterEach
    public void teardown(){
        System.out.println("The actual result of the calculation is: " + calculator.calculate());
    }
}
