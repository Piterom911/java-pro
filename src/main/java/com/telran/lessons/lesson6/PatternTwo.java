package com.telran.lessons.lesson6;

import java.util.ArrayList;
import java.util.List;

public class PatternTwo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Hello");
        list.add("Two");
        list.add("Something");
        list.add("Hallo");

        System.out.println("Original list: " + list);

        int lengthStr = 3;
        List<String> filteredList = filterByLength(list, lengthStr);
        System.out.println("Filtered list: " + filteredList);
    }

    private static List<String> filterByLength(List<String> list, int length) {
        List<String> newList = new ArrayList<>();
        for (String s : list) {
            if (s.length() == length) newList.add(s);
        }
        return newList;
    }
}
