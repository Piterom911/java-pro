package com.telran.summary.summary9;

import java.util.Arrays;

public class ExampleApp {

    public static void main(String[] args) {
        BookStorage bookStorage = new BookStorage();

        Book book1= new Book("Author One", "Title One", "123456");
        Book book2 = new Book("Author Two", "Title Two", "223456");
        Book book3 = new Book("Author Three", "Title Three", "323456");
        Book book4 = new Book("Author Four", "Title Four", "423456");
        Book book5 = new Book("Author Five", "Title Five", "523456");

        Arrays.asList(book1, book2, book3, book4, book5)
                .forEach(bookStorage::add);

        bookStorage.printAll();

        book2.setTitle(null);
        book2.setAuthor(null);
        bookStorage.printAll();

        boolean result = bookStorage.find(new Book("223456"));
        System.out.println(result);

    }
}
