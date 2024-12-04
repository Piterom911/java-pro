package com.telran.algorithm.algorithm04;

public class Fibonacci {

    public static void main(String[] args) {
        int num = 8;

        System.out.println(findFibonacci(num));

    }

    private static int findFibonacci(int index) {
        int result = 0;
        int first = 0;
        int second = 1;

        for (int i = 0; i < index ; i++) {
            result = first + second;
            first = second;
            second = result;
        }

        return result;
    }
}
