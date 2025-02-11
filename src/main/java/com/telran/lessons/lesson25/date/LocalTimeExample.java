package com.telran.lessons.lesson25.date;

import java.time.LocalTime;

public class LocalTimeExample {

    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(now.getHour() + " " + now.getMinute() + " " + now.getSecond() + " " + now.getNano());
    }
}
