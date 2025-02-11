package com.telran.lessons.lesson25.date;

import java.time.LocalDate;

public class LocalDateExample {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getYear() + " " + now.getMonth() + " " + now.getDayOfWeek() + " " + now.getChronology());

        LocalDate date = LocalDate.of(2025, 10, 5);
        System.out.println(date);
        date = date.minusMonths(22);
        System.out.println(date);
        date = date.plusDays(453);
        System.out.println(date);

        System.out.println(date.isLeapYear());
    }
}
