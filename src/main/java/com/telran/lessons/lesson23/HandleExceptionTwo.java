package com.telran.lessons.lesson23;

import java.io.FileReader;
import java.io.IOException;

public class HandleExceptionTwo {

    public static void main(String[] args) {
        exampleCheckedException(null);
        exampleCheckedException("somePathIsHere.txt");
        exampleCheckedException("/Users/dogoda/java/pro_01/src/main/java/com/telran/lessons/lesson23/HandleExceptionTwo.java");
    }

    private static void exampleCheckedException(String filename) {
        try {
            System.out.println("Try to read file with name: " + filename + " and length: " + filename.length());
            FileReader fileReader = new FileReader(filename);
            int a = 9 / 0;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("type null is not a name");
        } catch (Exception e) {
            System.err.println("Unexpected mistake from " + HandleExceptionTwo.class.getSimpleName());
        }
    }
}
