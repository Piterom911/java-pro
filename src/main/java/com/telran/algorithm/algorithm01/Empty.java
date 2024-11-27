package com.telran.algorithm.algorithm01;

import java.util.Arrays;

public class Empty {

    public static void main(String[] args) {
        int[] nums = {23, 4, 53, 62, 345, 5, 4, -3, 0};
        System.out.println(Arrays.toString(findMin(nums)));
    }

    private static int[] findMin(int[] nums) {
        if (nums.length < 4) {
            System.out.println("Array must contain at least 4 elements.");
            return null;
        }

        int min1 = nums[0];
        int min2 = nums[1];
        int min3 = nums[2];
        int min4 = nums[3];

        for (int num : nums) {
            if (num < min1) {
                min4 = min3;
                min3 = min2;
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min4 = min3;
                min3 = min2;
                min2 = num;
            } else if (num < min3) {
                min4 = min3;
                min3 = num;
            } else if (num < min4) {
                min4 = num;
            }
        }
        return new int[]{min1, min2, min3, min4};

        // Another algorithm

//        int[] minValues = Arrays.copyOf(nums, 4);
//        Arrays.sort(minValues);
//
//        for (int i = 4; i < nums.length; i++) {
//            if (nums[i] < minValues[3]) {
//                minValues[3] = nums[i];
//                Arrays.sort(minValues);
//            }
//        }
//
//        return minValues;
    }
}