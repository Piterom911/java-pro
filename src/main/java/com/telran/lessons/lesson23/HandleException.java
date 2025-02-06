package com.telran.lessons.lesson23;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HandleException {

    public static void main(String[] args) {
        try {
            exampleCheckedException();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static void exampleCheckedException() throws FileNotFoundException {
        try (FileReader fileReader = new FileReader("//home")) {
            int read = fileReader.read();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
