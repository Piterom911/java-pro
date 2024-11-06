package com.telran.lessons.lesson2;

public class Dog {

    private String name;

    public void voice() {
        System.out.println(this.getName() + " is saying: Woff! Woff!!");
    }

    public final void run() {
        System.out.println(this.name + " is running");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
