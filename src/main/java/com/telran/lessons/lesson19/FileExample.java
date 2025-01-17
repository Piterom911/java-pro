package com.telran.lessons.lesson19;

import java.io.File;
import java.util.Arrays;

public class FileExample {

    public static void main(String[] args) {
        String path = "/Users/dogoda/java/pro_01/src/main/java/com/telran/lessons/lesson19";
        File file = new File(path);
        System.out.println("File name: " + file.getName());
        System.out.println("File exists: " + file.exists());
        System.out.println("Is a File: " + file.isFile());
        System.out.println("Is a Directory: " + file.isDirectory());
        System.out.println("Length: " + file.length());
        System.out.println("Path: " + file.getAbsolutePath());

        String[] fileNames = file.list();
        System.out.println(Arrays.toString(fileNames));

        for (File someFile : file.listFiles()) {
            System.out.println(someFile.getName());
        }

    }
}
