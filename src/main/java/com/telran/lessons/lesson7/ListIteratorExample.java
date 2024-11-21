package com.telran.lessons.lesson7;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("aaa");
        strings.add("bbb");
        strings.add("ccc");
        strings.add("ddd");
        strings.add("eee");
        strings.add("fff");

        ListIterator<String> iterator = strings.listIterator();

        System.out.println("List elements in forward direction: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        System.out.println("List elements in forward direction: ");
        while (iterator.hasPrevious()) {
            System.out.print(iterator.previous() + iterator.nextIndex() + " ");
        }
    }
}
