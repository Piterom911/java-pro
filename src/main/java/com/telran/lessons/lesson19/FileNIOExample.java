package com.telran.lessons.lesson19;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileNIOExample {

    public static void main(String[] args) {
        Path path = Paths.get("/Users/dogoda/java/pro_01/src/main/java/com/telran/lessons/lesson19", "test.txt");
        try {
            List<String> strings = Files.readAllLines(path);
            strings.stream().forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
