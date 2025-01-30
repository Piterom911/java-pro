package com.telran.lessons.lesson22.mvc.view;

public interface View {

    void listAll();

    default void printGritting() {
        System.out.println("Hello! Would you like some coffee?");
    }
}
