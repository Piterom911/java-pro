package com.telran.lessons.lesson10.example;

import java.util.HashSet;
import java.util.Set;

public class ExampleApp {

    public static void main(String[] args) {
        Set<Object> set = new HashSet<>();
        Person person = new Person("Alex");
        Student student = new Student("Alex");
        set.add(person);
        set.add("hello");
        set.add(3);
        System.out.println(set);

        System.out.println(person.hashCode());
        System.out.println(student.hashCode());
        System.out.println(set.contains(new Student("Alex")));
    }
}
