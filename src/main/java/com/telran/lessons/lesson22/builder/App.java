package com.telran.lessons.lesson22.builder;

public class App {

    public static void main(String[] args) {
        Student student = new Student("Alex", "Johnson", 0, null, null, null, 1L, null);
        Student student1 = Student.builder().name("Alex").surname("Johnson").build();
        System.out.println(student1);
    }
}
