package com.telran.lessons.lesson22.singleton;

public class AppSingleton {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
    }
}
