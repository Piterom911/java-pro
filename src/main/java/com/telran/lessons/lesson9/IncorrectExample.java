package com.telran.lessons.lesson9;

import java.util.HashSet;
import java.util.Set;

public class IncorrectExample {

    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();

        students.add(new Student(1, "Alex", 25));
        students.add(new Student(2, "Oleg", 30));

        checkInSet(students);
    }

    private static void checkInSet(Set<Student> students) {
        Student alex = new Student(1, "Alex", 25);
        boolean contains = students.contains(alex);
        System.out.println("set contains Alex = " + contains);
    }
}
