package com.telran.summary.summary13;

import com.telran.summary.summary13.model.Product;
import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AdminController {

    private LanguageStorage languageStorage;

    private ProductStorage productStorage;

    private InfoStorage infoStorage;

    private BufferedReader reader;

    public AdminController(LanguageStorage languageStorage, ProductStorage productStorage, InfoStorage infoStorage, BufferedReader reader) {
        this.languageStorage = languageStorage;
        this.productStorage = productStorage;
        this.infoStorage = infoStorage;
        this.reader = reader;
    }

    @SneakyThrows
    public void start() {
        System.out.println("Choose Language: ");
        languageStorage.printLanguages();
        ;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String data = reader.readLine();

        String language = languageStorage.getLanguage(Integer.parseInt(data));

        System.out.println("Input product title: ");
        String title = reader.readLine();

        Product product = productStorage.getOrCreate(title);
        System.out.println(product.getTitle() + "_" + product.getId());

        System.out.println("Input your description: ");
        String desc = reader.readLine();
        infoStorage.addDescription(product, language, desc);
    }
}
