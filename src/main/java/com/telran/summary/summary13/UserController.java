package com.telran.summary.summary13;

import com.telran.summary.summary13.model.Product;

import java.io.BufferedReader;
import java.io.IOException;

public class UserController {

    private LanguageStorage languageStorage;

    private ProductStorage productStorage;

    private InfoStorage infoStorage;

    private BufferedReader reader;

    public UserController(LanguageStorage languageStorage, ProductStorage productStorage, InfoStorage infoStorage, BufferedReader reader) {
        this.languageStorage = languageStorage;
        this.productStorage = productStorage;
        this.infoStorage = infoStorage;
        this.reader = reader;
    }

    public void start() throws IOException {
        System.out.println("Please choose your language: ");
        languageStorage.printLanguages();


        String userLanguage = reader.readLine();

        String currentLanguage =languageStorage.getLanguage(Integer.parseInt(userLanguage));
        System.out.println("Your language: " + currentLanguage);

        System.out.println("Choose the dish: ");
        productStorage.printProduct();
        String userProduct = reader.readLine();
        Product product = productStorage.getProduct(Integer.parseInt(userProduct));
        System.out.println("Your order please: " + product.getTitle());

        String desc = infoStorage.getDesc(product, currentLanguage);
        System.out.println("Description: " + desc);
    }
}
