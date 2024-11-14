package com.telran.lessons.lesson5;


public enum Season {

    WINTER("It is cold.", "December"),
    SPRING("It is green.", "March"),
    SUMMER("It is cold.", "June"),
    FALL("It is cold.", "September");

    private String description;

    private String firstMonth;

    Season(String description, String firstMonth) {
        this.description = description;
        this.firstMonth = firstMonth;
    }

    public String getDescription() {
        return description;
    }

    public String getFirstMonth() {
        return firstMonth;
    }
}
