package com.telran.lessons.lesson17.practice;

import java.util.Arrays;

public class StreamPracticeExample {

    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {17, 13, 15}, {7, 9, 25}};
        Arrays.stream(array).flatMapToInt(elem -> Arrays.stream(elem))
                .forEach(elem -> System.out.print(elem + " "));
    }
}
