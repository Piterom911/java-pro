package com.telran.practice.practice20.example;

public class Donut extends Product {

    private String title;

    public Donut(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Donut{" +
                "title='" + title + '\'' +
                '}';
    }
}
