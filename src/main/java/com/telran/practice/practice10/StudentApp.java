package com.telran.practice.practice10;

import java.util.*;

public class StudentApp {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Max", "Smith"),
                new Student("Oleg", "Orlov"),
                new Student("John", "Johnson"),
                new Student("Steve", "Jobs"),
                new Student("Bella", "Smith"));

        Set<Student> students1 = new TreeSet<>(students);
        printStudentsTree(students1);

        System.out.println("Before sort: ");
        printStudents(students);
        System.out.println("After sort: ");
        Collections.sort(students);
        printStudents(students);

        System.out.println("Before sort: ");
        printStudents(students);
        Collections.sort(students, new Student.CompareByName());
        System.out.println("After sort: ");
        printStudents(students);

        System.out.println("Before sort: ");
        printStudents(students);
        Collections.sort(students, new Student.CompareBySurname());
        System.out.println("After sort: ");
        printStudents(students);

    }

    private static void printStudents (List<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();
    }

    private static void printStudentsTree (Set<Student> students) {
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();
    }
}
