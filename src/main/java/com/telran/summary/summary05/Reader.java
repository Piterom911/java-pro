package com.telran.summary.summary05;

public abstract class Reader implements Printer {

    private String name;

    private int readerId;

    private ReaderType type;

    private Book[] books;

    private static int idNumber = 1;

    public Reader(String name, ReaderType type, int limit) {
        this.name = name;
        this.readerId = idNumber++;
        this.type = type;
        this.books = new Book[limit];
    }

    @Override
    public void printBooks() {
        for (Book book: books) {
            System.out.println(book);
        }
    }
}
