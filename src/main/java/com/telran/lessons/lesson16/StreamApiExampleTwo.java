package com.telran.lessons.lesson16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiExampleTwo {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("10", "20", "30", "1", "15", "20", "10", "50", "25");

        // filter() & count()
        long count = list.stream().filter(s -> s.startsWith("20")).count();
        System.out.println("Count 20 = " + count);

        // filter() & collect()
        List<String> filteredList = list.stream().filter(s -> s.startsWith("1")).collect(Collectors.toList());
        System.out.println(filteredList);

        // sorted() & collect()
        List<String> sortedList = filteredList.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        // skip()
        List<String> skipedList = list.stream().skip(3).collect(Collectors.toList());
        System.out.println(skipedList);

        // limit()
        List<String> limitedList = list.stream().sorted().limit(3).collect(Collectors.toList());
        System.out.println(limitedList);

        // distinct()
        List<String> distinctList = list.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctList);

        // peek()
        List<String> peekedList = list.stream()
                .peek(s -> System.out.print(s + " "))
                .sorted()
                .peek(s -> System.out.print(s + " "))
                .filter(s -> s.startsWith("1"))
                .peek(s -> System.out.print(s + " "))
                .collect(Collectors.toList());
        System.out.println(peekedList);

        // map(function)

    }
}
