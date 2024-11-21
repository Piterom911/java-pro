package com.telran.lessons.lesson7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RetrievingElements {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("aaa", "bbb", "ccc", "ddd", "eee", "fff"));

        // standard for
        for (int i = 0; i < strings.size(); i++) {
            System.out.print(strings.get(i) + " ");
        }
        System.out.println();

        // for each
        for (String str : strings) {
            System.out.print(str + " ");
        }
        System.out.println();

        // iterator
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // iterator + for
        for (Iterator<String> i = strings.iterator(); i.hasNext(); ) {
            System.out.print(i.next() + " ");
        }
        System.out.println();

        // for each with lambda
        strings.forEach(value -> System.out.print(value + " "));
    }
}
