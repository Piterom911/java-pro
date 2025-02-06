package com.telran.lessons.lesson24;

public class CalcApp {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.sum(3, 9);
        System.out.println("sum: " + sum);
    }
}
