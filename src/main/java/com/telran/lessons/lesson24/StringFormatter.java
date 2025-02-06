package com.telran.lessons.lesson24;

public class StringFormatter {

    public String reverseInLowerCase(String string) {
        String ignoreCase = string.toLowerCase();
        return new StringBuilder(ignoreCase).reverse().toString();
    }
}
