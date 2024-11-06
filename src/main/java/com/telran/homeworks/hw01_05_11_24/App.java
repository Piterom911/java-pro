package com.telran.homeworks.hw01_05_11_24;

public class App {

    public static void main(String[] args) {
        Person personOne = new Person();

        Person personTwo = new Person("John", "John Doe", 45);

        personOne.setName("Matthew");
        personOne.setFullName("Matthew McConaughey");
        personOne.setAge(55);

        personOne.move();
        personOne.talk();

        personTwo.move();
        personTwo.talk();
    }
}
