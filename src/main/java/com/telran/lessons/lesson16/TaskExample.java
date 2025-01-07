package com.telran.lessons.lesson16;

import java.util.Arrays;
import java.util.List;

public class TaskExample {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("BigBen", "BigBob", "Big", "Ben", "Big Bob");
        long count = strings.stream().filter(s -> s.startsWith("Big")).count();
    }
}
