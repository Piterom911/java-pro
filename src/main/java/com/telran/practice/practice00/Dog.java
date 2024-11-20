package com.telran.practice.practice00;

public class Dog extends Animal {


    public Dog(String name, String colour, int age, boolean isHungry) {
        super(name, colour, age, isHungry);
    }

    public Dog(String name) {
        super(name);
    }

    public void bark() {
        System.out.println("Woff! Woff!!!");
    }
}
