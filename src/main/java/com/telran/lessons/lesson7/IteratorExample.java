package com.telran.lessons.lesson7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("aaa");
        strings.add("bbb");
        strings.add("ccc");
        strings.add("ddd");
        strings.add("eee");
        strings.add("fff");

        System.out.println(strings);

        Iterator<String> iterator = strings.iterator();
        String next0 = iterator.next();
        String next1 = iterator.next();
        String next2 = iterator.next();
        String next3 = iterator.next();
        String next4 = iterator.next();
        String next5 = iterator.next();

        Iterator<String> iterator2 = strings.iterator();
        while (iterator2.hasNext()) {
            System.out.print(iterator2.next() + " ");
        }
    }
}
