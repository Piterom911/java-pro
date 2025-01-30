package com.telran.lessons.lesson22.dryyagnikiss;
/**
*   DRY -> Don't repeat yourself
**/
public class Book {

    private String title;

    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void printInfo() {
        printTitle();
        printAuthor();
    }

    public void printTitle() {
        System.out.println("Book title = " + title);
    }

    public void printAuthor() {
        System.out.println("Book author = " + author);
    }
}
