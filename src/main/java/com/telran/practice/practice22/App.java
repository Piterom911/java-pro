package com.telran.practice.practice22;

import java.util.List;

public class App {

    public static void main(String[] args) {

        Book book = new Book("One", "OneAuTHOR", 1, 3);
        Book book1 = new Book("Two", "TwoAuTHOR", 2, 3);
        Book book2 = new Book("Three", "ThreeAuTHOR", 3, 1);

        List<Book> books = List.of(book,book1,book2);

        User alex = new User("Alex");
        User max = new User("Max");

        List<User> users = List.of(alex,max);

        Library library = new Library(books, users);

        LibraryManager libraryManager = new LibraryManager(library);

        libraryManager.borrowBook(1,alex);

        library.printAvalibleBooks();



    }
}
