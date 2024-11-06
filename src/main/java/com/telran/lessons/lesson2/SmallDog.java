package com.telran.lessons.lesson2;

public class SmallDog extends Dog {

    public void jump() {
        System.out.println(this.getName() + " is jumping.");
    }

    @Override
    public void voice() {
        System.out.println(this.getName() + " is saying: tyaf tyaf!");
    }
}
