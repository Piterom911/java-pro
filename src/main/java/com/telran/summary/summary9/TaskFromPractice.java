package com.telran.summary.summary9;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TaskFromPractice {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("two", "one", "double", "Hello");
        System.out.println("List before sorting: " + strings);
        sortList(strings);
        System.out.println("List after sorting: " + strings);
    }

    private static void sortList(List<String> strings) {
        Set<String> set = new TreeSet<>();
        for (int i = 0; i < strings.size(); i++) {
            String s = strings.get(i);
            set.add(s);
        }

        int index = 0;
        for (String s : set) {
            strings.set(index++, s);
        }
    }
}
