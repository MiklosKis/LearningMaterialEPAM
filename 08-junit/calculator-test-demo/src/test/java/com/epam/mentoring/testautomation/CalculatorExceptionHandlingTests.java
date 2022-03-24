package com.epam.mentoring.testautomation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorExceptionHandlingTests {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testSevenDivZeroIsNotAllow() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.div(7, 0).calculate();
        });
    }
}
