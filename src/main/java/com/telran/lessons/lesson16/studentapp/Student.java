package com.telran.lessons.lesson16.studentapp;

import lombok.Getter;
import lombok.Setter;

public class Student {

    @Getter
    private String name;

    @Setter
    @Getter
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
