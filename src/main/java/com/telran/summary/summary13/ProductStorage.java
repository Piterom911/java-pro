package com.telran.summary.summary13;

import com.telran.summary.summary13.model.Product;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ProductStorage {

    private final Map<Integer, Product> productMap = new HashMap();

    public ProductStorage() {
        init();
    }

    public void init() {
        Product soup = new Product(1, "Soup");
        Product pasta = new Product(2, "Pasta");
        Product burger = new Product(3, "Burger");
        Product wine = new Product(4, "Wine");

        productMap.put(soup.getId(), soup);
        productMap.put(pasta.getId(), pasta);
        productMap.put(burger.getId(), burger);
        productMap.put(wine.getId(), wine);
    }

    public void printProduct() {
        productMap.forEach((key, value) -> {
            System.out.println(key + " -> " + value.getTitle());
        });
    }

    public Product getProduct(int key) {
        return productMap.get(key);
    }

    public Product getOrCreate(String title) {
        for (Product product : productMap.values()) {
            if (product.getTitle().equals(title)) {
                return product;
            }
        }

        int maxKey = 0;
        for (Integer key : productMap.keySet()) {
            maxKey = Math.max(maxKey, key);
        }

        Product product = new Product(maxKey + 1, title);
        productMap.put(product.getId(), product);
        return product;
    }
}
