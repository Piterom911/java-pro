package com.telran.lessons.lesson8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

    public static void main(String[] args) {
        LinkedList<Integer> listOne = new LinkedList<>();
        ArrayList<Integer> listTwo = new ArrayList<>();

        List<Integer> one = new LinkedList<>();
        List<Integer> two = new ArrayList<>();

        printList(one);
        printList(two);
    }

    private  static void printList(List<Integer> integers) {
        for (Integer value : integers) {
            System.out.println(value);
        }
    }
}
