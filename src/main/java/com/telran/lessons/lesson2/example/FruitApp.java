package com.telran.lessons.lesson2.example;

public class FruitApp {

    public static void main(String[] args) {
        Apple apple = new Apple("apple", 200, "green");
        Pineapple pineapple = new Pineapple("pineapple", 2000);
        Banana banana = new Banana("banana", 230, "yellow", "Panama");

        System.out.println(banana);
    }


    private static void printFruit() {
        System.out.println();
    }
}
