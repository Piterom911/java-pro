package com.telran.lessons.lesson16;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class StreamApiFlatMapExample {

    public static void main(String[] args) {
        List<Integer> one = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> two = Arrays.asList(6, 7, 8, 9);

        List<List<Integer>> all = Arrays.asList(one, two);
        all.stream().flatMap(Collection::stream)
                .map(value -> value * 2)
                .forEach(value -> System.out.print(value + " "));
    }
}
