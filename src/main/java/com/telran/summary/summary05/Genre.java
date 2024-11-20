package com.telran.summary.summary05;

public enum Genre {
    FICTION("Fiction"),
    NON_FICTION("Non-Fiction"),
    MYSTERY("Mystery"),
    THRILLER("Thriller"),
    FANTASY("Fantasy"),
    ROMANCE("Romance"),
    SCIENCE_FICTION("Science-Fiction");

    private final String description;

    Genre(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
