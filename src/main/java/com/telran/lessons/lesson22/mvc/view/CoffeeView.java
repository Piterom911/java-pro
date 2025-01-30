package com.telran.lessons.lesson22.mvc.view;

import com.telran.lessons.lesson22.mvc.base.Storage;
import com.telran.lessons.lesson22.mvc.model.Cake;

import java.util.List;

public class CoffeeView implements View {

    private Storage storage;

    public CoffeeView(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void listAll() {
        List<Cake> all = storage.getAll();
        System.out.println(all);
    }
}
