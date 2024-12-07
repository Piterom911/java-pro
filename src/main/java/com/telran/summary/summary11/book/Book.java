package com.telran.summary.summary11.book;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class Book {

    private String title;

    private Genre genre;

    private Author author;

    private int year;
}
