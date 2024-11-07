package com.telran.lessons.lesson3;

public abstract class Animal {

    private String name;

    public void eat() {
        System.out.println(this.name + " eats.");
    }

    public abstract void drink();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
