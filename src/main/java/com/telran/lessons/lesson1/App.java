package com.telran.lessons.lesson1;

public class App {

    public static void main(String[] args) {
        Cat catOne = new Cat("Tom");
        Cat catTwo = new Cat("Barsik");
        Cat catThree = new Cat("Murka");

        System.out.println(catThree);
        System.out.println(catOne);
        System.out.println(catTwo);

        Cat[] cats = {catOne, catThree, catTwo};

        Human person1 = new Human("Roman");
        person1.feedCat(catOne);
        person1.feedCat(cats);

        System.out.println(catOne);
        System.out.println(catThree);
        System.out.println(catTwo);
    }
}
