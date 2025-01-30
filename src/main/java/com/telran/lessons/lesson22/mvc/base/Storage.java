package com.telran.lessons.lesson22.mvc.base;

import com.telran.lessons.lesson22.mvc.model.Product;

import java.util.List;

public interface Storage<T> {

    List<Product> getAll();
}
