package com.telran.practice.summery05;

import java.util.Scanner;

public class LibraryApp {

    public static void main(String[] args) {
        Book bookOne = new NonFictionBook("Book One", "Author One", "123", Genre.NON_FICTION);
        Book bookTwo = new NonFictionBook("Book Two", "Author Two", "253", Genre.NON_FICTION);
        Book bookThree = new NonFictionBook("Book Three", "Author Three", "345", Genre.ROMANCE);

        Librarian[] librarians = {};
        Reader readerOne = new AdultReader("Alex", ReaderType.ADULT, 5);

        System.out.println("Department list: ");
        for (Department department: Department.values()) {
            System.out.println(department);
        }

        readerOne.printBooks();

        System.out.println("Please choose department: ");
        Scanner scanner = new Scanner(System.in);
        String departmentAsString = scanner.next();
        Department department = Department.valueOf(departmentAsString);

        Librarian ourLibrarian = null;
        System.out.println("Books form this department: ");
        for (Librarian librarian : librarians) {
            if (department == librarian.getDepartment()) {
                librarian.printBooks();
                ourLibrarian = librarian;
            }
        }

        System.out.println("Please choose a book: ");
        String isbn = scanner.next();
        ourLibrarian.giveBook(isbn, readerOne);
        readerOne.printBooks();
    }
}
