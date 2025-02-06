package com.telran.lessons.lesson24;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringFormatterTest {

    private StringFormatter stringFormatter = new StringFormatter();

    @ParameterizedTest
    @ValueSource(strings = {"HELLO", "hello", "Hello"})
    public void testReverseWhenStringIsCorrect (String test) {
        assertEquals("olleh", stringFormatter.reverseInLowerCase(test));
    }

    @Test
    public void testReverseWhenStringIsEmpty () {
        assertEquals("", stringFormatter.reverseInLowerCase(""));
    }
}