package com.telran.lessons.lesson18;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 *  InputStream
 *  OutputStream
 */

public class InputOutputExample {

    public static void main(String[] args) {
        // System.out — стандартный попток вывода - по дефолту в консоль
        PrintStream out = System.out;
        out.println("hello ");
        out.println("java");
        System.out.printf("x = %d", 10);

        // System.in — стандартный поток для ввода с консоли

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }
}
