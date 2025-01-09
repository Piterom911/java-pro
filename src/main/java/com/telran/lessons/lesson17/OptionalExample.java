package com.telran.lessons.lesson17;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        String fr = getLanguage("de").orElse("en").toUpperCase();
        System.out.println(fr);
    }

    private static Optional<String> getLanguage(String lng) {
        Map<String, String> map = new HashMap();
        map.put("en", "en");
        map.put("de", "de");
        return Optional.ofNullable(map.get(lng));
    }
}
