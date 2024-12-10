package com.telran.practice.practice12;

import lombok.Getter;

import java.util.*;

public class HashMapPractice {

    public static void main(String[] args) {
        List<Dog> dogs = List.of(new Dog("Max", 12, "Black", false),
                new Dog("Bob", 13, "White", true),
                new Dog("Laika", 19, "White", false),
                new Dog("Alex", 18, "Yellow", true));
        //a
        Map<String, Boolean> mapOne = new HashMap<>();
        dogs.forEach(dogOne -> mapOne.put(dogOne.getName(), dogOne.isHungry));
        System.out.println(mapOne);

        //b
        Map<String, Long> mapTwo = new HashMap<>();

        for (int i = 0; i < dogs.size(); i++) {
            String colour = dogs.get(i).getColour();
            Long count = mapTwo.getOrDefault(colour, 0L);
            mapTwo.put(colour, ++count);
        }

        System.out.println(mapTwo);

        //c Получить Map<String, Set<String>> цвет / список имен собак данного цвета
        Map<String, Set<String>> mapThree = new HashMap<>();

        for (int i = 0; i < dogs.size(); i++) {
            String colour = dogs.get(i).getColour();
            Set<String> names =  mapThree.getOrDefault(colour, new HashSet<>());

            names.add(dogs.get(i).getName());
            mapThree.put(colour, names);
        }
        System.out.println(mapThree);
    }

    @Getter
    public static class Dog {

        private String name;

        private int age;

        private String colour;

        private boolean isHungry;

        public Dog(String name, int age, String color, boolean isHungry) {
            this.name = name;
            this.age = age;
            this.colour = color;
            this.isHungry = isHungry;
        }
    }
}
