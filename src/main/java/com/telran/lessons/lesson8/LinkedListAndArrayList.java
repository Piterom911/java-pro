package com.telran.lessons.lesson8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListAndArrayList {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            integerList.add(i);
        }

        for (Integer value : integerList) {
            System.out.print(value + " ");
        }

        LinkedList<String> strings = new LinkedList<>();
        strings.add("One");
        strings.add("Two");
        strings.add("Three");

        integerList.addFirst(3);
    }
}
