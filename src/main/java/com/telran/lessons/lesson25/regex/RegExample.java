package com.telran.lessons.lesson25.regex;

import java.util.regex.Pattern;

public class RegExample {

    public static void main(String[] args) {
        String regex = "\\d*+[A-Z]*";
        String original = "43AAA";
        System.out.println(Pattern.matches(regex, original));
    }
}
