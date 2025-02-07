package com.telran.summary.summary24;

import org.junit.jupiter.api.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookStorageTest {

    private static BookStorage bookStorage = new BookStorage();

    @BeforeAll
    private static void initAll() {
        System.out.println("--> BEFORE ALL TESTS <--");
    }

    @AfterAll
    private static void destroyAll() {
        System.out.println("--> AFTER ALL TESTS <--");
    }

    @BeforeEach
    private void clear() {
        System.out.println("Before each...");
        bookStorage.reInit();
    }

    @AfterEach
    private void destroy() {
        System.out.println("After each...");
    }

    @Test
    public void testGetAllBooksFromStorage() {
        List<Book> all = bookStorage.getAll();
        assertEquals(3, all.size());
    }

    @Test
    public void testAddBookToStorage() {
        Book four = new Book("Four", 350);
        Book entity = bookStorage.add(four);
        List<Book> all = bookStorage.getAll();
        assertEquals(4, all.size());
        assertEquals(4, entity.getId());
    }

    @Test
    public void testGetByTitle() {

    }

    @Test
    public void testAddBook() {

    }

    @Test
    public void testDeleteBook() {

    }
}