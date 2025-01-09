package com.telran.practice.practice17;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task {

    public static void main(String[] args) {
        // 1. Из списка имен вывести первое по алфавиту, предпоследнее по алфавиту
        List<String> names = Arrays.asList("Roman", "Andrew", "Anna", "Sarah", "Bob", "John", "Vita");

        String s = names.stream().sorted().findFirst().get();
        System.out.println(s);

        String s1 = names.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(s1);

        // 2. Посчитать количество чисел от 1 до 1000, которые делятся на 7.
        long numToSeven = IntStream.rangeClosed(1, 1000).filter(a -> a % 7 == 0).count();
        System.out.println(numToSeven);

        // 3. Посчитать сумму квадратов чисел от 1 до 100
        int sum = IntStream.rangeClosed(1, 100).map(a -> a * a).sum();
        long sum2 = IntStream.rangeClosed(1, 100).reduce(0, (akk, b) -> akk + b * b);
        System.out.println(sum);
        System.out.println(sum2);

        @Getter
        @Setter
        @ToString
        @AllArgsConstructor
        class Cat {
                private String name;
                private int age;
                private String colour;
                private boolean isHungry;
        }

        Cat cat1 = new Cat("Tom", 2, "black", true);
        Cat cat2 = new Cat("Mikky", 1, "white", false);
        Cat cat3 = new Cat("Vasya", 3, "white", true);
        Cat cat4 = new Cat("Steve", 1, "grey", false);
        Cat cat5 = new Cat("Bob", 2, "black", true);
        List<Cat> catList = Arrays.asList(cat1, cat2, cat3, cat4, cat5);

        //    a. Получить Map<String, Boolean> имя / информация, голодна ли кошка
        Map<String, Boolean> cats1 = catList.stream().collect(Collectors.toMap(Cat::getName, Cat::isHungry));
        System.out.println(cats1);

        //    b. Получить Map<String, Long> цвет / количество кошек данного цвета
        Map<String, Integer> cats2 = catList.stream().collect(Collectors.toMap(Cat::getColour, value -> 1, (first, second) -> first + second));
        Map<String, Long> cats2_v2 = catList.stream().collect(Collectors.groupingBy(Cat::getColour, Collectors.counting()));

        System.out.println(cats2);
        System.out.println(cats2_v2);

        //    c. Получить Map<String, Set<String>> цвет / список имен кошек данного цвета
        Map<String, List<Cat>> cats3 = catList.stream().collect(Collectors.groupingBy(Cat::getColour, Collectors.toList()));
        System.out.println(cats3);

        //    d. Получить Map<Integer, Integer> возраст / количество голодных кошек данного возраста
        Map<Integer, Integer> cats4 = catList.stream()
                .collect(Collectors.groupingBy(Cat::getAge, Collectors.mapping(Cat::isHungry, Collectors.summingInt(isHungry -> isHungry ? 1 : 0))));
        System.out.println(cats4);
    }
}






