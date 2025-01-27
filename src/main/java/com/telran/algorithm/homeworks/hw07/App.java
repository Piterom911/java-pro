package com.telran.algorithm.homeworks.hw07;
// 1 уровень сложности: Задача частотного анализа строки заключается в подсчете количества вхождений каждого символа
// в заданной строке. Это полезно во многих областях, например, в криптографии, лингвистике и сжатии данных.
// Формулировка задачи:
// Дана строка s, состоящая из латинских букв. Необходимо определить, сколько раз встречается каждая буква в этой строке.
// Входной формат:
// Строка s, содержащая только символы букв латинского алфавита в любом регистре (a-z A-Z). Строка может быть пустой.
// Выходной формат:
// Выведите встречающиеся символы в строке с указанием их количества.
// Пример:
// "АbraСadabra"
// Результат:
// a - 5
// b - 2
// r - 2
// c - 1
// d - 1
// Важно! При подсчете не учитывается регистр, a и A - одинаковые.

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {
        Map<String, Integer> charOccurrenceHashMap = countCharOccurrence("АbraСAdabra");
        for (Map.Entry<String, Integer> entry : charOccurrenceHashMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    public static Map<String, Integer> countCharOccurrence(String string) {
        HashMap<String, Integer> charOccurrenceHashMap = new HashMap<>();
        Arrays.stream(string.split(""))
                .map(String::toLowerCase)
                .forEach(c -> charOccurrenceHashMap.put(c, charOccurrenceHashMap.getOrDefault(c, 0) + 1));
        return charOccurrenceHashMap;
    }
}
