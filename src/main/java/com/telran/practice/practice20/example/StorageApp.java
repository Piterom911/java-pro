package com.telran.practice.practice20.example;

import java.util.Arrays;
import java.util.List;

public class StorageApp {

    public static void main(String[] args) {
        Storage<Donut> donatStorage = new Storage<>();
        donatStorage.add(new Donut("Vanilla"));
        donatStorage.add(new Donut("Banana"));
        donatStorage.add(new Donut("Classic"));

        Storage<Burger> burgerStorage = new Storage<>();
        burgerStorage.add(new Burger("Mexican"));

        List<Storage> storageList = Arrays.asList(donatStorage, burgerStorage);
        storageList.forEach(Storage::printStorage);

    }
}
