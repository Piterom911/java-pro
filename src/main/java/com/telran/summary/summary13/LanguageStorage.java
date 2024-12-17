package com.telran.summary.summary13;

import jakarta.annotation.PostConstruct;

import java.util.HashMap;
import java.util.Map;

public class LanguageStorage {

    private final Map<Integer, String> languages = new HashMap<>();

    public LanguageStorage() {
        init();
    }

    @PostConstruct
    private void init() {
        languages.put(1, "English");
        languages.put(2, "German");
        languages.put(3, "French");
    }

    public void printLanguages() {
        for (Map.Entry<Integer, String> pair : languages.entrySet()) {
            System.out.println(pair.getKey() + " -> " + pair.getValue());
        }
    }

    public String getLanguage(int key) {
        return languages.getOrDefault(key, languages.get(1));
    }
}
