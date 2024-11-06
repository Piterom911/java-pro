package com.telran.lessons.lesson1.practice;

public class Passport {

    private String number;

    private String validFrom;

    private String validTill;

    public Passport(String number, String validFrom, String validTill) {
        this.number = number;
        this.validFrom = validFrom;
        this.validTill = validTill;
    }

    public String getNumber() {
        return number;
    }

    public String getValidFrom() {
        return validFrom;
    }

    public String getValidTill() {
        return validTill;
    }
}
