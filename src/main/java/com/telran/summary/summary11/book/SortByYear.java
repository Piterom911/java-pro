package com.telran.summary.summary11.book;

import java.util.Comparator;

public class SortByYear implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getYear() - o2.getYear();
    }
}