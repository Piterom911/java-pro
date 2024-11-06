package com.telran.lessons.lesson1;

public class Cat {

    private String name;
    private String color;
    private int age;
    private boolean isHungry;

    public Cat(String name, String color, int age, boolean isHungry) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.isHungry = isHungry;
    }

    public Cat(String name) {
        this.name = name;
        this.color = "white";
        this.age = 1;
        this.isHungry = true;
    }

    public void sayHello() {
        System.out.println(this.name + " Meow");
    }

    public void feed() {
        this.isHungry = false;
    }

    public String toString() {
        return "Cat name: " + name + "\nCat color " + color + "\nCat age " + age + "\nThe cat is " + (isHungry ? " " : "not") + "hungry \n";
    }
}

