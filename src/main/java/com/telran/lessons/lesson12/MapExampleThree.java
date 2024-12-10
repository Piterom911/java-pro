package com.telran.lessons.lesson12;

import java.util.*;

public class MapExampleThree {

    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(2, "Hello");
        map1.put(4, "Hi");
        map1.put(1, "Hallo");

        boolean b = map1.containsKey(3);
        System.out.println("3 is contained in map: " + b);

        boolean b1 = map1.containsValue("Hi"); // IMPORTANT: not good to use. High complexity
        System.out.println("Hi is contained in map: " + b1);

        Set<Integer> integerSet = map1.keySet();
        Collection<String> stringSet = map1.values();

        if (map1.containsKey(10)) {
            String value = map1.get(10);
            System.out.println(value);
        }
    }
}
