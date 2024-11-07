package com.telran.lessons.lesson3;

public class Whale extends WaterAnimal {

    @Override
    public void drink() {
        System.out.println(getName() + " drinks salt water!");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " swims in ocean!");
    }
}
