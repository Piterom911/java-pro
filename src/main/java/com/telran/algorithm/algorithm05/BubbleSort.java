package com.telran.algorithm.algorithm05;

import java.time.LocalTime;
import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] notSortedArr = {3, 6, 1, -3, 77, 12, -44, 76, 23};
        int[] sortedArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(bubbleSortOpt(sortedArr)));
    }

    public static int[] bubbleSortOpt(int[] arr) {
        boolean isSorted = true;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            isSorted = true;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;
                }
                count++;
            }
            if (isSorted) {
                break;
            }
        }
        System.out.println(count);
        return arr;
    }

    public static int[] bubbleSort(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                count++;
            }
        }
        System.out.println(count);
        return arr;
    }
}
