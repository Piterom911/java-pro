package com.telran.lessons.lesson26.annotation;

public class Greetings {

    @HelloAnnotation
    private String text;

    private String name;

    @HelloAnnotation
    public void sayHello(String name) {
        System.out.println("Hello");
    }

    public void sayHi(String name) {
        System.out.println("Hi " + name);
    }
}
