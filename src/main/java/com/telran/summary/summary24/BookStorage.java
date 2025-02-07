package com.telran.summary.summary24;

import java.util.*;

public class BookStorage {

    SortedMap<Long, Book> dataBase = new TreeMap<>();

    Map<String, Book> storage = new HashMap<>();

    public BookStorage() {
        initDb();
    }

    private void initDb() {
        List<Book> books = Arrays.asList(
                new Book("ONE", 134),
                new Book("TWO", 234),
                new Book("THREE", 764));
        long id = 1;
        for (Book book : books) {
            book.setId(id++);
            dataBase.put(book.getId(), book);
        }
    }

    public void reInit() {
        dataBase.clear();
        initDb();
    }

    public List<Book> getAll() {
        return new ArrayList<>(dataBase.values());
    }

    public Book add(Book book){
        Long lastId = dataBase.lastKey();
        long id =  lastId + 1;
        book.setId(id);
        dataBase.put(id, book);
        return book;
    }

    public Book getByTitle(String title) {
        if (title == null) {
            throw new IncorrectBookTitleException("Book title is incorrect");
        }
        Book book = storage.get(title);
        if (book == null) {
            throw new BookNotFoundException("Book with name " + title + " not found.");
        }
        return book;
    }
}
