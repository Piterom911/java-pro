package com.telran.lessons.lesson10.compare;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PassportApp {

    public static void main(String[] args) {
        List<Passport> passports = Arrays.asList(
                new Passport(14342),
                new Passport(14574),
                new Passport(14567));
        System.out.println("Before sort: ");
        printPassports(passports);
        Collections.sort(passports);
        System.out.println("After sort: ");
        printPassports(passports);
    }

    private static void printPassports(List<Passport> passports) {
        passports.forEach(System.out::println);
    }
}
