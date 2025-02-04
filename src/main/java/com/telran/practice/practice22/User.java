package com.telran.practice.practice22;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {

    private static Long currentID = 1l;

    private String name;

    private Long userId;

    public static Long getCurrentID() {
        return currentID;
    }

    public String getName() {
        return name;
    }

    private List<Book> borrowedBooks;

    public User(String name) {
        this.name = name;
        this.userId = currentID++;
        borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book){
        borrowedBooks.add(book);
    }

    public void returnBook(Book book){
        boolean deleted = borrowedBooks.remove(book);
        if (!deleted){
            System.out.println("Book is absent");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) && Objects.equals(userId, user.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, userId);
    }
}
