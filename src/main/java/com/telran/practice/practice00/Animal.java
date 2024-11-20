package com.telran.practice.practice00;

public class Animal {

    private String name;

    private String colour;

    private int age;

    private boolean isHungry;

    public Animal(String name, String colour, int age, boolean isHungry) {
        this.name = name;
        this.colour = colour;
        this.age = age;
        this.isHungry = isHungry;
    }

    public Animal(String name) {
        this.name = name;
        this.colour = "white";
        this.age = 1;
        this.isHungry = true;
    }

    public void sayHello() {
        System.out.println("Hello! I'm cat. My name is " + name);
    }

    public void feed() {
        isHungry = false;
        System.out.println("Cat " + name + " is not hungry anymore");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", age=" + age +
                ", isHungry=" + isHungry +
                '}';
    }

    public String getName() {
        return this.name;
    }
}
