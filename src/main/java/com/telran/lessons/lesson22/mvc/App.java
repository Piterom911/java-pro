package com.telran.lessons.lesson22.mvc;

import com.telran.lessons.lesson22.mvc.base.CoffeeStorage;
import com.telran.lessons.lesson22.mvc.controller.CoffeeController;
import com.telran.lessons.lesson22.mvc.view.CoffeeView;

public class App {

    public static void main(String[] args) {
        CoffeeStorage coffeeStorage = new CoffeeStorage();
        CoffeeView coffeeView = new CoffeeView(coffeeStorage);
        CoffeeController coffeeController = new CoffeeController(coffeeView);
        coffeeController.runApp();
    }
}
