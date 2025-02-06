package com.telran.lessons.lesson23.exceptions;

import java.util.HashMap;
import java.util.Map;

public class BookStorage {

    Map<String, Book> storage = new HashMap<>();

    public BookStorage() {
        init();
    }

    private void init() {
        storage.put("one", new Book("ONE", 134));
        storage.put("two", new Book("TWO", 234));
        storage.put("three", new Book("THREE", 764));
    }

    public Book getByTitle(String title) {
        if (title == null) {
            throw new IncorrectBookTitleException("Book title is incorrect");
        }
        Book book = storage.get(title);
        if (book == null) {
            throw new BookNotFoundException("Book with name " + title + " not found.");
        }
        return book;
    }
}
