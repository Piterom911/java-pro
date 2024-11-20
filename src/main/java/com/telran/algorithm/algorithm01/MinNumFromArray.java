package com.telran.algorithm.algorithm01;

import java.util.Arrays;

public class MinNumFromArray {

    public static void main(String[] args) {
        int[] nums = {23, 345, 5, 0, 4, -1, 53, 62, 345, 5, 0};
        System.out.println(Arrays.toString(findMin(nums)));
    }

    private static int[] findMin(int[] nums) {
        int min = nums[0] < nums[1] ? nums[0] : nums[1];
        int min2 = nums[0] > nums[1] ? nums[0] : nums[1];

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] < min) {
                min2 = min;
                min = nums[i];
            } else if (nums[i] < min2) {
                min2 = nums[i];
            }
        }
        return new int[]{min, min2};
    }
}
