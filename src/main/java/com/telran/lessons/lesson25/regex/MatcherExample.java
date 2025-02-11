package com.telran.lessons.lesson25.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherExample {

    public static void main(String[] args) {
        String text = "Hello efrt@cob.com asd;lfkjsad;flkj someemail@some.de this will be my first time hiking in the mountains";
        String regex = "([A-Za-z0-9._-]+@[A-Za-z0-9._-]+\\.[A-Za-z0-9_-]+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String substring = text.substring(start, end);
            System.out.println(substring);
        }
    }
}
