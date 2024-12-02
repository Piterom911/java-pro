package com.telran.algorithm.homeworks.hw02;

import java.util.Arrays;

public class SortedArray {

    public static void main(String[] args) {
        int[] arr1 = {1, 3,3,3,3,3,3, 5 , 7};
        int[] arr2 = {2, 4, 6};

        System.out.println(Arrays.toString(uniteSortedArrays(arr1, arr2)));
    }

    public static int[] uniteSortedArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }

        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }

        return result;
    }
}
