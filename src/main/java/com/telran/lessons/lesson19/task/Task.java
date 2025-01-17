package com.telran.lessons.lesson19.task;

import java.io.FileWriter;
import java.io.IOException;

public class Task {

    public static void main(String[] args) {
        String string = "some words are";
        String commonPath = "/Users/dogoda/java/pro_01/src/main/java/com/telran/lessons/lesson19/task";
        String[] words = string.split(" ");

        for (int i = 0; i < words.length; i++) {
            String path = commonPath + "/" + words[i] + ".txt";
            try (FileWriter fileWriter = new FileWriter(path)) {
                fileWriter.write(words[i]);
                fileWriter.flush();
                System.out.println();
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
