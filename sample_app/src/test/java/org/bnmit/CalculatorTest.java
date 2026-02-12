package org.bnmit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Unit tests for Calculator class
 */
public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(10.0, calculator.add(5, 5));
    }

    @Test
    public void testSubtraction() {
        assertEquals(0.0, calculator.subtract(5, 5));
    }

    @Test
    public void testMultiplication() {
        assertEquals(25.0, calculator.multiply(5, 5));
    }

    @Test
    public void testDivision() {
        assertEquals(2.0, calculator.divide(10, 5));
    }

    @Test
    public void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> {
            calculator.divide(10, 0);
        });
    }
}
