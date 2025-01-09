package com.telran.lessons.lesson17.practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamPracticeExampleThree {

    public static void main(String[] args) {
        Student studentOne = new Student(1, "John");
        Student studentTwo = new Student(2, "Sarah");

        studentOne.addBook("Book One");
        studentOne.addBook("Book Two");
        studentOne.addBook("Book Three");

        studentTwo.addBook("Book One");
        studentTwo.addBook("Book Four");
        studentTwo.addBook("Book Five");

        List<Student> students = Arrays.asList(studentOne, studentTwo);
        Set<String> uniqueBooks = students.stream()
                .map(Student::getBooks)
                .flatMap(Collection::stream)
                .collect(Collectors.toSet());

        System.out.println(uniqueBooks);
    }
}
