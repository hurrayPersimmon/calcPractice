package com.example.week_eleven;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class CalculatorTest {
    private CalculatorService calculatorService;

    @BeforeEach
    public void setUp() {
        calculatorService = new CalculatorService();
    }

    @Test
    public void testSum() {
        int a = 1;
        int b = 2;
        int result = calculatorService.sum(a, b);
        assertEquals(3, result);
    }

    @Test
    public void testSubtract() {
        int a = 2;
        int b = 1;
        int result = calculatorService.subtract(a, b);
        assertEquals(1, result);
    }

    @Test
    public void testMultiply() {
        int a = 1;
        int b = 2;
        int result = calculatorService.multiply(a, b);
        assertEquals(1, result);
    }

    @Test
    public void testDivide() {
        int a = 4;
        int b = 2;
        int result = calculatorService.divide(a, b);
        assertEquals(2, result);
    }
}
