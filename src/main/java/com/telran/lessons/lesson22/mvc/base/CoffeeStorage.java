package com.telran.lessons.lesson22.mvc.base;

import com.telran.lessons.lesson22.mvc.model.Coffee;
import com.telran.lessons.lesson22.mvc.model.Product;

import java.util.List;

public class CoffeeStorage implements Storage {


    @Override
    public List<Product> getAll() {
        return List.of(new Coffee("Black"), new Coffee("Latte"));
    }
}
