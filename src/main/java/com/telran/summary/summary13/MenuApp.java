package com.telran.summary.summary13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenuApp {

    public static void main(String[] args) throws IOException {
        LanguageStorage languageStorage = new LanguageStorage();
        ProductStorage productStorage = new ProductStorage();
        InfoStorage infoStorage = new InfoStorage();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean isNeedToStop = false;
        while (!isNeedToStop) {
            System.out.println("Choose:\n 1 -> Admin\n 2 -> User\n 0 -> Exit");
            String userData = reader.readLine();
            int data = Integer.parseInt(userData);
            switch (data) {
                case 1 -> new AdminController(languageStorage, productStorage, infoStorage, reader).start();
                case 2 -> new UserController(languageStorage, productStorage, infoStorage, reader).start();
                case 0 -> {
                    System.out.println("Bye!");
                    isNeedToStop = true;
                }
            }
        }

        reader.close();
    }
}
