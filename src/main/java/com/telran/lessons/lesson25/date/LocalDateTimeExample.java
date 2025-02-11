package com.telran.lessons.lesson25.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        LocalDate date = now.toLocalDate();
        LocalTime time = now.toLocalTime();
        System.out.println(date + "T" + time);

        LocalDateTime local = LocalDateTime.of(date, time);
        System.out.println(local);

        DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_TIME;
        String format = now.format(formatter);
        System.out.println(format);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(now.format(formatter2));
    }
}
