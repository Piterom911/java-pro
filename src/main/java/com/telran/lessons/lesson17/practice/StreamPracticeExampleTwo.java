package com.telran.lessons.lesson17.practice;

import java.util.stream.Stream;

public class StreamPracticeExampleTwo {

    public static void main(String[] args) {
        String[][] array = {{"a", "b"}, {"c", "d"}, {"e", "f"}};
        Stream.of(array).flatMap(Stream::of)
                .filter(str -> !str.equals("a"))
                .toList()
                .forEach(System.out::println);
    }
}
