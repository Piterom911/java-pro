package com.telran.lessons.lesson23;

public class ExceptionExample {

    public static void main(String[] args) {
        exampleUncheckedException(10, 0);
        exampleUncheckedException(10, 3);
    }

    private static void exampleUncheckedException(int a, int b) {
        if (b == 0) return;
        System.out.println(a * 1.0 / b);
    }
}
