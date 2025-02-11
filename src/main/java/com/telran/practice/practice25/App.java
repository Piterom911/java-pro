package com.telran.practice.practice25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    public static void main(String[] args) {
        // 1) Напишите регулярное выражение, которое соответствует пин-коду из 4 чисел.
        System.out.println("Pin-код проверки: ");
        String[] pins = {"1234", "5678", "8974", "1236h", "o785"};
        String regex = "\\d{4}";
        Pattern pattern = Pattern.compile(regex);
        for (String pin : pins) {
            Matcher matcher = pattern.matcher(pin);
            System.out.println(pin + " " + matcher.matches());
        }

        // 2) Напишите регулярное выражение, которое соответствует именам клавиш F1-F12.
        String[] keys = {"F1", "F2", "F3", "F123", "F0"};
        String regex1 = "F(10|11|12|[1-9])";
        for (String key : keys) {
            System.out.println(key + " " + Pattern.matches(regex1, key));
        }

        // 3) Имеется текст "Php is the best programming language in the world. I study php." Замените в нем php на java.
    }
}
