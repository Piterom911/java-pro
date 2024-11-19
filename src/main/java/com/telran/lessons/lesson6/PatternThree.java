package com.telran.lessons.lesson6;

import java.util.ArrayList;
import java.util.List;

public class PatternThree {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(3);
        list.add(2);
        list.add(9);
        list.add(7);
        list.add(0);
        list.add(8);

        System.out.println("Sum of elements is " + getListSum(list));
    }

    private static int getListSum(List<Integer> list) {
        int sum = 0;

        for (Integer integer : list) {
            sum += integer;
        }

        return sum;
    }
}
