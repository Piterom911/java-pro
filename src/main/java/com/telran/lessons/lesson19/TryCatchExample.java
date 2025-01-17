package com.telran.lessons.lesson19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TryCatchExample {

    public static void main(String[] args) {
        String path = "/out.txt";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            try {
                throw new RuntimeException();
            } catch (RuntimeException ex) {
                System.err.println(e.getMessage());
            }
        } finally {
            System.out.println("Block finally");
        }
        System.out.println("End of program");
    }
}
