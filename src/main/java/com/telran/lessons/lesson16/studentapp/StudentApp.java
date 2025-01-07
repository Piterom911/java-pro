package com.telran.lessons.lesson16.studentapp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentApp {

    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student("Oleg", 25),
                new Student("Max", 35),
                new Student("Peter", 18)
        );

        List<Student> collect = list.stream().peek(student -> student.setAge(student.getAge() + 5)).collect(Collectors.toList());
        System.out.println(list);
    }
}
