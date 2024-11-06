package com.telran.lessons.lesson1;

public class Human {
    public String name;

    public Human(String name) {
        this.name = name;
    }

    public void feedCat(Cat cat) {
        cat.feed();
    }

    public void feedCat(Cat[] cats) {
        for (int i = 0; i < cats.length; i++) {
            cats[i].feed();
        }
    }
}
