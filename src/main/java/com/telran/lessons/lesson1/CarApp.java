package com.telran.lessons.lesson1;

public class CarApp {

    public static void main(String[] args) {
        // new - is a key word that allows us to create a new object based on a class
        Car carOne = new Car();
        carOne.model = "VW";
        carOne.color = "Red";

        Car carTwo = new Car();
        carTwo.color = "Black";
        carTwo.model = "Audi";

        String model = carOne.model;
        System.out.println("Car one model is" + carOne.model + ", car one color is " + carOne.color);

        carOne.startEngine();
        carTwo.startEngine();
    }
}
