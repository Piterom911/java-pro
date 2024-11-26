package com.telran.practice.practice08;

import java.util.Iterator;
import java.util.LinkedList;

public class App {

    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("Some String with some info.");
        strings.add("Some String without any info.");
        strings.add("Some String with unusual info.");
        strings.add("Some String with good info.");

        // Task 1
        String shortestStr = "";
        for (String string : strings) {
            if (shortestStr.length() < string.length()) {
                shortestStr = string;
            }
        }
        System.out.println(shortestStr);


        // Task 2
        StringBuilder builder = new StringBuilder();
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            builder.append(iterator.next());
            if (iterator.hasNext()) {
                builder.append(" | ");
            }
        }
        System.out.println(builder);


        // Task 3
        LinkedList<PhoneNumber> numbers = new LinkedList<>();
        numbers.add(new PhoneNumber("+49", "12346789"));
        numbers.add(new PhoneNumber("+123", "12346789"));
        numbers.add(new PhoneNumber("+25", "12346789"));
        numbers.add(new PhoneNumber("+49", "12346789"));
        numbers.add(new PhoneNumber("+15", "12346789"));
        numbers.add(new PhoneNumber("+49", "12346789"));

        Iterator<PhoneNumber> phoneNumberIterator = numbers.iterator();
        while (phoneNumberIterator.hasNext()) {
            PhoneNumber next = phoneNumberIterator.next();
            if (!next.getCode().equals("+49")) {
                phoneNumberIterator.remove();
            }
        }
        System.out.println(numbers);
    }
}
