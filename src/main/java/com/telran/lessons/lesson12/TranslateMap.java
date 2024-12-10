package com.telran.lessons.lesson12;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TranslateMap {

    public static void main(String[] args) {
        System.out.println("1 -> English\n2 -> German\n3 -> French");
        Scanner  scanner = new Scanner(System.in);
        System.out.println(getGreetings(scanner.nextInt()));
    }

    private static String getGreetings(int lang) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Hello");
        map.put(2, "Hallo");
        map.put(3, "Bonjour");
        return map.getOrDefault(lang, map.get(1));
    }
}
