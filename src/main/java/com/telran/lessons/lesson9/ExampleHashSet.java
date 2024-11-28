package com.telran.lessons.lesson9;

import java.util.HashSet;
import java.util.Set;

public class ExampleHashSet {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("D");
        set.add("F");
        set.add("D");
        set.add("c");
        set.add("B");
        System.out.println(set);

        for (String value : set) {
            System.out.println("hashcode for " + value + " -> " + value.hashCode());
        }
    }
}
