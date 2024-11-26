package com.telran.summary.sammary7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListTaskExample {

    public static void main(String[] args) {
        List<String> cities = new ArrayList<>();
        cities.add("Berlin");
        cities.add("Bon");
        cities.add("Hamburg");
        cities.add("Koblenz");
        cities.add("Frankfurt");

        System.out.println(cities);
        reverseList(cities);
        System.out.println(cities);
    }

    private static void reverseList(List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int startId = 0; startId < list.size() / 2; startId++) {
            int endId = list.size() - 1 - startId;
            swap(list, startId, endId);
        }
    }

    private static void swap(List<String> list, int startId, int endId) {
        String temp = list.get(startId);
        list.set(startId, list.get(endId));
        list.set(endId, temp);
    }

}
