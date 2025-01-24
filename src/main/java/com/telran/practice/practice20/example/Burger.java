package com.telran.practice.practice20.example;

public class Burger extends Product {

    private String title;

    public Burger(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "title='" + title + '\'' +
                '}';
    }
}
