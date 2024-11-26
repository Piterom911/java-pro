package com.telran.summary.summary5;

public abstract class Librarian implements Printer {

    private static final int BOOK_LIMIT = 10;

    private String name;

    private Department department;

    private final Book[] books = new Book[BOOK_LIMIT];

    public void giveBook(String isbn, Reader reader) {

    }

    public Librarian(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public void printBooks() {
        for (Book book: books) {
            System.out.println(book);
        }
    }

    public Department getDepartment() {
        return department;
    }

    public Book[] getBooks() {
        return books;
    }
}
