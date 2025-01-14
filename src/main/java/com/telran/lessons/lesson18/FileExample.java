package com.telran.lessons.lesson18;

import java.io.FileInputStream;
import java.io.IOException;

public class FileExample {

    public static void main(String[] args) {
        String path = "/Users/dogoda/java/pro_01/src/main/java/com/telran/lessons/lesson18/test.txt";
        try (FileInputStream fileInputStream = new FileInputStream(path)) {
            StringBuilder builder = new StringBuilder();
            while (fileInputStream.available() > 0) {
                int data = fileInputStream.read();
                builder.append((char) data);
            }
            System.out.println(builder);
        } catch (IOException e) {
            System.err.println(e);;
        }
    }
}
