package com.telran.lessons.lesson25.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternExample {

    public static void main(String[] args) {
        String regex = ".*www.*";
        String actual = "www.telran.de";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(actual);
        System.out.println(matcher.matches());

        System.out.println(Pattern.matches(regex, actual));
    }
}
