package com.telran.practice.practice22;

import java.util.List;

public class Library {

    private List<Book> books;

    private List<User> users;

    public Library(List<Book> books, List<User> users) {
        this.books = books;
        this.users = users;
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<User> getUsers() {
        return users;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void registerUser(User user) {
        users.add(user);
    }

    public Book findBookByIsbn(int isbn) {
        return books.stream()
                .filter(book -> book.getIsbn() == isbn)
                .findFirst()
                .orElse(null);
    }

    public void printAvalibleBooks(){
        books.stream()
                .filter(b -> b.getAvailableCopies()>0)
                .forEach(System.out::println);
    }

    public void printUserBook(){
        users.stream().forEach(System.out::println);
    }
}
