package com.telran.lessons.lesson2.example;

public abstract class Fruit {

    private String title;

    private int weight;

    private String color;

    public Fruit(String title, int weight, String color) {
        this.title = title;
        this.weight = weight;
        this.color = color;
    }

    public Fruit(String title, int weight) {
        this.title = title;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "title='" + title + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
