package com.telran.practice.practice20.example;

import java.util.HashMap;
import java.util.Map;

public class DonatStorage {

    private Map<String, Donut> storage = new HashMap<>();

    public void add(Donut donut) {
        storage.put(donut.getTitle(), donut);
    }

    public Donut getByTitle(String title) {
        return storage.get(title);
    }

    public void printStorage() {
        storage.values().forEach(System.out::println);
    }
}
