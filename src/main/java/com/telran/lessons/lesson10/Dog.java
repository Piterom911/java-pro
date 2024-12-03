package com.telran.lessons.lesson10;

public class Dog {

    private String name;

    private int age;

    private Color color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Dog dog)) return false;

        if (this.name == null) {
            return false;
        }

        return this.name.equals(dog.name) &&
                this.age == dog.age &&
                this.color == dog.color;
    }
}
