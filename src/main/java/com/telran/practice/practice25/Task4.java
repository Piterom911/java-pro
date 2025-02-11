package com.telran.practice.practice25;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class Task4 {

    public static void main(String[] args) {
        LocalDate victoryDay = LocalDate.of(1945, 5, 9);
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.of("ru")); // ("dd-MMMM-yy", Locale.of("ru"));
        DateTimeFormatter formatterEng = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.of("en")); // ("dd-MMMM-yy", Locale.of("ru"));

        String format = formatter.format(victoryDay);
        String formatEng = formatterEng.format(victoryDay);
        System.out.println(format);
        System.out.println(formatEng);
        System.out.println(victoryDay.getDayOfWeek());
        LocalDate minusTenYears = victoryDay.minusYears(10);
        System.out.println(minusTenYears);

        LocalDate april = LocalDate.of(2025, 4, 3);
        LocalDate with = april.with(TemporalAdjusters.previousOrSame(DayOfWeek.SUNDAY));
        System.out.println(april);
        LocalDate now = LocalDate.now();
        long between = ChronoUnit.DAYS.between(now, april);
        System.out.println(between);
    }
}

// 4) создать дату любого события
// - вывести на консоль на русском / английском языках
// - найти, на какой день недели выпала дата события
// - вычесть 10 лет из созданной даты, вывести на консоль
//6) Составить список времен начала всех занятий по Java Practice за февраль, если предположить,
//что они будут проходить каждый вторник/четверг c 13:15 CET.
