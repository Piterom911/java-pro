package com.telran.practice.practice22;

import java.util.List;
import java.util.Map;

public class LibraryManager {

    private Library library;

    private Map<String, List<User>> borrowsBooks;

    public LibraryManager(Library library) {
        this.library = library;
    }

    public void borrowBook(Integer isbn, User user) {
        Book book = library.findBookByIsbn(isbn);
        if (book.getAvailableCopies() > 0) {
            user.borrowBook(book);
            book.setAvailableCopies(book.getAvailableCopies() - 1);
        }
    }

    public void returnBook(Integer isbn, User user) {
        Book book = library.findBookByIsbn(isbn);
        user.returnBook(book);
        book.setAvailableCopies(book.getAvailableCopies() + 1);
    }

    public void addBook(Book book) {
        library.addBook(book);
    }

    public void removeBook(Book book) {
        library.removeBook(book);
    }

    public void registerUser(User user) {
        library.registerUser(user);
    }
}
