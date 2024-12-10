package com.telran.lessons.lesson12;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 100);
        map.put("Pineapple", 150);
        map.put("Lemon", 50);
        map.put("Carrot", 20);
        map.put("Carrot", 30);

        System.out.println(map);

        int carrotPrice = map.get("Carrot");
        System.out.println("Carrot price is: " + carrotPrice);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.println("Pair: key = " + key + ", value = " + value);
        }

        map.forEach((k, v) -> System.out.println("Pair: key = " + k + ", value = " + v));
    }
}
