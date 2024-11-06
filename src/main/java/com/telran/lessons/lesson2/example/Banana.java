package com.telran.lessons.lesson2.example;

public class Banana extends Fruit {

    private String origin;

    public Banana(String title, int weight, String color) {
        super(title, weight, color);
    }

    public Banana(String title, int weight, String color, String origin) {
        super(title, weight, color);
        this.origin = origin;
    }

    @Override
    public String toString() {
        String parentStr = super.toString();
        return parentStr + "Banana{" +
                "origin='" + origin + '\'' +
                '}';
    }
}
