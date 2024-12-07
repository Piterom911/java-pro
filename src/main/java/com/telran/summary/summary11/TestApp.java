package com.telran.summary.summary11;

public class TestApp {

    public static void main(String[] args) {
        String one = "Hello!";
        String two = "Hello!";

        String three  = new String("Hello!");

        boolean resultOne = one == two;
        boolean resultTwo = one == three;
        System.out.println(resultOne);
        System.out.println(resultTwo);
    }
}
