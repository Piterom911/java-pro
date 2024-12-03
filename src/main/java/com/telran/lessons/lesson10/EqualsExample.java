package com.telran.lessons.lesson10;

public class EqualsExample {

    public static void main(String[] args) {
        int one = 10;
        int two = 10;
        System.out.println(one == two);

        Integer three = Integer.valueOf(10);
        System.out.println(three == two);

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        System.out.println(dog1.equals(dog2));
    }
}
