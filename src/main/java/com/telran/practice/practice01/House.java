package com.telran.practice.practice01;

import com.telran.practice.practice01.creatures.Cat;
import com.telran.practice.practice01.creatures.Dog;
import com.telran.practice.practice01.creatures.Human;
import com.telran.practice.practice01.creatures.Robot;
import com.telran.practice.practice01.skills.Walkable;

public class House {

    public static void main(String[] args) {

        // Part 1
        Cat tom = new Cat("Tom");
        tom.sayHello();
        tom.feed();
        System.out.println(tom);

        Robot robot1 = new Robot("Vacuum cleaner", "Robot to clean the house");
        robot1.printCurrentRobotInfo();
        Robot robot2 = new Robot("Washing machine", "Robot to wash something");
        robot2.printCurrentRobotInfo();
        Robot.printTotalRobotCount();

        Human human = new Human("Mark");
        human.feedAnimal(tom);

        // Part 2
        Dog dog = new Dog("Bobby", "grey", 3, false);
        dog.sayHello();
        human.walk(dog);
        System.out.println(dog);
        human.feedAnimal(dog);

        // Part 3
        human.play(robot1);
        tom.play(dog);
        dog.play(tom);

        robot1.walk(dog);
        robot1.catchMouse();

        boolean condition = true;
        Walkable walkable;
        if (condition) {
            walkable = human;
        } else {
            walkable = robot1;

        }
        walkable.walk(dog);
    }


}
