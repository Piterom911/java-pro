package com.telran.lessons.lesson23.exceptions;

public class BookApp {

    public static void main(String[] args) {
        BookStorage bookStorage = new BookStorage();
        try {
            bookStorage.getByTitle("FIVE");
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
            System.out.println("Try another one");
        } catch (IncorrectBookTitleException e) {
            System.out.println(e.getMessage());
            System.out.println("Please be sure that you've typed correct title");
        }
    }
}
