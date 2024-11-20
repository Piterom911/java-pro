package com.telran.practice.practice01.creatures;

import com.telran.practice.practice01.skills.Walkable;

public class Human extends Creature implements Walkable {

    public Human(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("Hello! I'm human. My name is " + getName());
    }

    public void feedAnimal(Animal animal) {
        System.out.println("Human " + getName() + " feeds the animal " + animal.getName());
        animal.feed();
    }
    public void feedAnimal(Animal[] animals){
        for (Animal animal : animals) {
            feedAnimal(animal);
        }
    }

    @Override
    public void walk(Animal animal) {
        System.out.println("Human " + getName() + " walks with " + animal.getName());
        animal.setHungry(true);
    }
}
