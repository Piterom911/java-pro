package com.telran.lessons.lesson22.mvc.controller;

import com.telran.lessons.lesson22.mvc.view.CoffeeView;

public class CoffeeController {

    private CoffeeView view;

    public CoffeeController(CoffeeView view) {
        this.view = view;
    }

    public void runApp() {
        view.printGritting();
        view.listAll();
    }
}
