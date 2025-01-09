package com.telran.lessons.lesson17;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsExample {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person(1L, "Alex", "Alexeev"),
                new Person(2L, "Peter", "Petrov"),
                new Person(2L, "Oleg", "Olegov"));

        Map<String, String> mapStr = new HashMap<>();
        for (Person person : people) {
            mapStr.put(person.getName(), person.getSurname());
        }
        System.out.println(mapStr);

        Map<Long, Person> mapId = new HashMap<>();
        for (Person person : people) {
            mapId.put(person.getId(), person);
        }
        System.out.println(mapId);

        people.stream()
                .collect(Collectors.toMap(person -> person.getName(), person -> person.getSurname()));

        Map<Long, Person> mapIdCollect = people.stream()
                .collect(Collectors.toMap(person -> person.getId(), Function.identity(), (first, second) -> first));
        System.out.println(mapIdCollect);

        String[] strings = {"Hello", "Java"};
        String result = Arrays.stream(strings).collect(Collectors.joining(" ", "+", "-"));
        System.out.println(result);

        String[] strings1 = {"one", "two", "three", "four", "eight"};
        Map<Integer, List<String>> collect = Arrays.stream(strings1).collect(Collectors.groupingBy(String::length, Collectors.toList()));
        System.out.println(collect);
    }
}
