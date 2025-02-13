package com.telran.lessons.lesson26.customtest;

public class CustomTestCalculator {

    @CustomTest
    public void testSum() {
        System.out.println("Sum a + b = 5 ");
    }

    @CustomTest
    public void testSub() {
        System.out.println("Sum a - b = 2");
        throw new IllegalArgumentException("Incorrect arg");
    }

    @CustomParamTest(ints = {1, 2, 3, 4, 5, 6, 7})
    public void testMult(int param) {
        System.out.println("Mult " + param + " = " + (param * param));
    }
    @CustomParamTest(strings = {"Hello", "Hi", "Arigato", "Salam"})
    public void testSayGreetings(String greeting) {
        System.out.println("Say " + greeting);
    }

    public void printResult() {
        System.out.println("Result");
    }
}
