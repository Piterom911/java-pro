package com.telran.practice.practice01;

public class Cat extends Animal {

    public Cat(String name, String colour, int age, boolean isHungry) {
        super(name, colour, age, isHungry);
    }

    public Cat(String name) {
        super(name);
    }

    public void meow() {
        System.out.println("Meow!!! Meow!!!");
    }

    @Override
    public void sayHello() {
        super.sayHello();
        meow();
    }
}
