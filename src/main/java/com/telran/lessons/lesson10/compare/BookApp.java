package com.telran.lessons.lesson10.compare;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BookApp {

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("Two", 100, 1950),
                new Book("Four", 95, 1975),
                new Book("One", 150, 1940));

        System.out.println("Before sort: ");
        printBooks(books);

        books.sort(new SortByYear());
        System.out.println("After sort: ");
        printBooks(books);

        books.sort(new SortByYear());
        System.out.println("After sort: ");
        printBooks(books);

        books.sort(new SortByTitle());
        System.out.println("After sort: ");
        printBooks(books);
    }

    private static void printBooks(List<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
        System.out.println();
    }
}
