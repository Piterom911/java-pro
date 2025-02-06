package com.telran.lessons.lesson24;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        int result = calculator.sum(5, 4);
        assertEquals(9, result);
    }

    @Test
    public void testSub() {

    }

    @ParameterizedTest
    @NullAndEmptySource
    public void testFindMaxWhenArrayIsEmptyOrNull(int[] arr) {
        assertThrows(IllegalArgumentException.class, () -> calculator.findMax(arr));
    }

    @Test
    public void testFindMaxWhenArrayIsPositive() {
        int[] arr = {1, 3, 4, 7, 2};
        int max = calculator.findMax(arr);
        assertEquals(7, max);

    }

    @Test
    public void testFindMaxWhenArrayIsNegative() {
        int[] arr = {-3, -5, -4, -2};
        assertEquals(-2, calculator.findMax(arr));
    }
}