package com.telran.algorithm.algorithm06;

public class ReverseNumber {

    public static void main(String[] args) {
        int num = -120;
        System.out.println(reverseNum(num));
    }

    public static int reverseNum(int num) {
        int result = 0;
//        boolean isNegative = num < 0;
        int temp = 1;

        if (num < 0) {
            num *= -1;
            temp = -1;
        }

        while (num > 0) {
            int firstNum = num % 10;
            result = result * 10 + firstNum ;
            num = num / 10;
        }

        return result * temp;
    }
}
