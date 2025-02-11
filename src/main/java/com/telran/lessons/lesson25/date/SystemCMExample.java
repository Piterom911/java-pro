package com.telran.lessons.lesson25.date;

import java.util.Date;

public class SystemCMExample {

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        System.out.println(new Date(System.currentTimeMillis()));
    }
}
