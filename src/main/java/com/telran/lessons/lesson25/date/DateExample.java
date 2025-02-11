package com.telran.lessons.lesson25.date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateExample {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        Date dateTwo = new Date(9384752098435L);
        System.out.println(dateTwo);

        System.out.println(date.getTime());

        boolean after = dateTwo.after(date);
        boolean before = dateTwo.before(date);
        System.out.println(after + " " + before);

        Locale locale = new Locale("de");
        Date dateLocale = new Date();
        String format = String.format(locale, "%tc\n", dateLocale);
        System.out.println(format);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yy/dd/MMMM");
        String format2 = dateFormat.format(new Date());
        System.out.println(format2);
    }
}
