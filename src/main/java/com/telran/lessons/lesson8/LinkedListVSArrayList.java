package com.telran.lessons.lesson8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class LinkedListVSArrayList {

    public static void main(String[] args) {
        List<Integer> one = new ArrayList<>();
        List<Integer> two = new LinkedList<>();

        long start = System.currentTimeMillis();
        crateList(one);
        long end = System.currentTimeMillis();
        System.out.println("Array list takes: " + (end - start));

        long start2 = System.currentTimeMillis();
        crateList(two);
        long end2 = System.currentTimeMillis();
        System.out.println("Linked list takes: " + (end2 - start2));
    }

    private static void crateList(List<Integer> integerList) {
        Random random = new Random();
        for (int i = 0; i < 5000; i++) {
            integerList.add(0, random.nextInt(100));
//            integerList.add(random.nextInt(100));
        }
    }
}
