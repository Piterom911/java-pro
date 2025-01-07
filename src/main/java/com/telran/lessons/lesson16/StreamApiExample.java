package com.telran.lessons.lesson16;

import java.util.Arrays;
import java.util.List;

public class StreamApiExample {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        list.stream()
                .filter(integer -> integer % 2 == 0)
                .forEach(integer -> System.out.println(integer + " "));
    }
}
