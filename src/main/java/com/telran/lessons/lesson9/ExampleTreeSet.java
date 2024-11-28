package com.telran.lessons.lesson9;

import java.util.*;

public class ExampleTreeSet {

    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<>();
        set.add("D");
        set.add("B");
        set.add("A");
        set.add("E");
        set.add("C");
        set.add("B");
        System.out.println(set);
        System.out.println("First element = " + set.first());
        System.out.println("Last element = " + set.last());

        String e = "C";
        System.out.println("Set contains " + e + "?  -> " +set.contains(e));

        set.remove("B");
        System.out.println(set);

        System.out.println("\nUse forEach: ");
        for (String value : set) {
            System.out.print(value + " ");
        }

        System.out.println("\nUse iterator: ");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        System.out.println("\nUse forEach with lambda: ");
        set.forEach(value -> System.out.print(value + " "));

        System.out.println("\nTail set: " + set.tailSet("D"));
        System.out.println("Head set: " + set.headSet("D"));


        SortedSet<Integer> integers = new TreeSet<>();
        integers.add(4);
        integers.add(1);
        System.out.println(integers);

    }
}
