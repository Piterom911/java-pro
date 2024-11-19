package com.telran.lessons.lesson6;

import java.util.ArrayList;
import java.util.List;

public class PatternOne {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("TWO");
        list.add("THRee");
        System.out.println("Original list: " + list);
        List<String> convertedList = convertList(list);
        System.out.println("Converted list: " + convertedList);

        System.out.println("Original list: " + list);
        inPlaceConvertList(list);
        System.out.println("Original list: " + list);
    }

    private static List<String> convertList(List<String> list) {
        List<String> newList = new ArrayList<>();
        for (String value : list) {
            newList.add(value.toLowerCase());
        }
        return newList;
    }

    private static void inPlaceConvertList(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i).toLowerCase());
        }
    }
}
