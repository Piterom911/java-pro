package com.telran.practice.practice23;
//3. Один метод вызывает три других метода, которые выбрасывают проверяемые и непроверяемые исключения:
//
//Отловить эти исключения и выбросить вместо них MyAppException, который содержал бы информацию о типе
//исходного исключения и его сообщение.

import java.io.IOException;

public class Task3 {

    public static void main(String[] args) {
        try {
            throwMethod();
        } catch (MyAppException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }

    public static void throwMethod() throws MyAppException {
        try {
            method1();
            method2();
            method3();
        } catch (IOException | NullPointerException | ArithmeticException e) {
            throw new MyAppException("Some of three exceptions occuerred", e);
        }
    }

    public static void method1() {
        System.out.println(1 / 0);
    }
    public static void method2() {
        throw new NullPointerException("nulls everywhere!");
    }
    public static void method3() throws IOException {
        throw new IOException("File not found");
    }
}
