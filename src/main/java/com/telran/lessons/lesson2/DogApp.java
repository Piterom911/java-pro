package com.telran.lessons.lesson2;

public class DogApp {

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.setName("Barbos");
        dog1.voice();
        dog1.run();

        SmallDog smallDog = new SmallDog();
        smallDog.setName("Barbosik");
        smallDog.jump();
        smallDog.voice();
        smallDog.run();

        BigDog bigDog = new BigDog();
        bigDog.setName("Barbosina");
        bigDog.voice();
        bigDog.run();
    }
}
