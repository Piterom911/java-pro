package com.telran.summary.summary19.translator;

public enum Language {
    ENGLISH("english.txt"),
    GERMAN("german.txt"),
    SPANISH("spain.txt");

    private String fileName;

    Language(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
}
