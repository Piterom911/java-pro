package com.telran.lessons.lesson17.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static com.telran.lessons.lesson17.practice.Color.*;

public class StreamPracticeExampleFour {

    public static void main(String[] args) {
        List<Cat> cats = Arrays.asList(
                new Cat("Bob", 1, true, BLACK),
                new Cat("Tom", 2, false, WHITE),
                new Cat("Jerry", 3, true, BROWN),
                new Cat("Mars", 4, false, RED),
                new Cat("Bob", 10, true, RED),
                new Cat("Bob", 15, false, BLACK),
                new Cat("Bob", 11, true, WHITE),
                new Cat("Bob", 9, false, BLACK)
        );

        List<Cat> hungryOldCats = cats.stream()
                .filter(cat -> cat.isHungry() && cat.getAge() > 10)
                .collect(Collectors.toList());
        System.out.println(hungryOldCats);

        Set<Color> allColors = cats.stream().map(cat -> cat.getColor()).collect(Collectors.toSet());
        System.out.println(allColors);
    }
}
