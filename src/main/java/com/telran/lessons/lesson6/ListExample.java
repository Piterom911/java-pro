package com.telran.lessons.lesson6;

import java.util.ArrayList;

public class ListExample {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(3);
        list.add(6);

        System.out.println(list);

        list.add(5);
        list.add(6);
        list.add(3);
        list.add(2);
        list.add(9);
        list.add(7);
        list.add(0);
        list.add(8);
        list.add(1);
        list.add(13);

        System.out.println(list);

        int element = list.get(2);
        System.out.println("Element by index 2 is " + element);

        list.addFirst(15);
        list.set(0, 25);
        System.out.println(list);
        System.out.println("Size of list: " + list.size());
        System.out.println("Is list empty: " + list.isEmpty());
        System.out.println("Does List contain number 9: " + list.contains(9));

        list.remove(Integer.valueOf(3));
        list.remove(3);

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();
        for (int item : list) {
            System.out.print(item + " ");
        }
    }
}
