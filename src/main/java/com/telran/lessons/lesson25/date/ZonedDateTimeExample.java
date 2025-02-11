package com.telran.lessons.lesson25.date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonedDateTimeExample {

    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(availableZoneIds);

        LocalDate date = now.toLocalDate();
        LocalTime time = now.toLocalTime();
        ZoneId zone = now.getZone();
        ZonedDateTime of = ZonedDateTime.of(date, time, zone);
        System.out.println(of);
    }
}
