package com.telran.lessons.lesson24;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;

import java.util.stream.Stream;

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
    @MethodSource(value = "generateData")
    public void testFindMaxWhenArrayIsCorrect(int[] arr, int result) {
        assertEquals(result, calculator.findMax(arr));
    }

    private static Stream<Arguments> generateData() {
        Arguments arguments = Arguments.of(new int[]{1, 3, 4, 7, 2}, 7);
        Arguments argumentsTwo = Arguments.of(new int[]{-3, -5, -4, -2}, -2);
        return Stream.of(arguments, argumentsTwo);
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void testFindMaxWhenArrayIsEmptyOrNull(int[] arr) {
        assertThrows(IllegalArgumentException.class, () -> calculator.findMax(arr));
    }
}