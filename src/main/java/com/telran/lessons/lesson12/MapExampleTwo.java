package com.telran.lessons.lesson12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExampleTwo {

    public static void main(String[] args) {
        Map<Integer, List<String>> map1 = new HashMap<>();
        map1.put(1, new ArrayList<>());

        Map<String, String> innerMap = new HashMap<>();
        Map<String, Map<String, String>> extMap = new HashMap<>();
        extMap.put("mapOne", innerMap);
        Map<String, String> map2 = extMap.get("mapOne");


    }
}
