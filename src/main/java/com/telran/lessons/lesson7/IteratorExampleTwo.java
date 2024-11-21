package com.telran.lessons.lesson7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExampleTwo {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }
        System.out.println(integers);
//        for (int i = 0; i < integers.size(); i++) {
//            if (integers.get(i) % 2 != 0) {
//                integers.remove(i);
//            }
//        }

//        for (int value : integers) {          // DOES NOT WORK => ConcurrentModificationException
//            if (value % 2 != 0) {
//                integers.remove(value);
//            }
//        }

//        int size = integers.size();            // DOES NOT WORK => IndexOutOfBoundsException
//        for (int i = 0; i < size; i++) {
//            if (integers.get(i) % 2 != 0) {
//                integers.remove(i);
//            }
//        }

        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            int elem = iterator.next();
            if (elem % 2 != 0) {
                iterator.remove();
            }
        }
        System.out.println(integers);
    }
}
