package com.telran.lessons.lesson12.task;

import java.util.HashMap;
import java.util.Map;

public class TaskOne {

    public static void main(String[] args) {
        String string = "k fgjadf94jsjfnvapP{IOG8_ )hgt[r 0*rth;1 @Qargf pogia -_9ihr";
        Map<Character, Integer> charMap = new HashMap<>();

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);
            Integer value = charMap.getOrDefault(c, 0);
            charMap.put(c, ++value);
        }

        charMap.forEach((k, v) -> System.out.println(k + " -> " + v));


    }
}
