package com.telran.lessons.lesson1;

public class DogApp {

    public static void main(String[] args) {
        Dog bars = new Dog("Bars", 3);
        System.out.println("Dog name " + bars.getName() + ", age = " + bars.getAge());

        bars.setAge(5);
    }
}
