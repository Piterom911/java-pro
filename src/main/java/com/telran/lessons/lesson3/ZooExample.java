package com.telran.lessons.lesson3;

public class ZooExample {

    public static void main(String[] args) {
        Horse horse = new Horse();
        Lion lion = new Lion();
        Rabbit rabbit = new Rabbit();
        Whale whale = new Whale();

        horse.setName("Horse");
        lion.setName("Lion");
        rabbit.setName("Rabbit");
        whale.setName("Whale");
        whale.swim();

        Animal[] animals = {horse, lion, rabbit, whale};
        for (Animal animal: animals) { animal.eat();}
        for (Animal animal: animals) { animal.drink();}
    }
}
