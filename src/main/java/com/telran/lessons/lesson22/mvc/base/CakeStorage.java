package com.telran.lessons.lesson22.mvc.base;

import com.telran.lessons.lesson22.mvc.model.Cake;
import com.telran.lessons.lesson22.mvc.model.Product;

import java.util.List;

public class CakeStorage implements Storage {


    @Override
    public List<Product> getAll() {
        return List.of(new Cake("Barny"), new Cake("Donut"));
    }
}
