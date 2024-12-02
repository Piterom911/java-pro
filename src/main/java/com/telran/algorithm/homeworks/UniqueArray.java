package com.telran.algorithm.homeworks;

import java.util.Arrays;

public class UniqueArray {

    static int[] nums = {2, 2, 2, 2, 3, 3, 3, 4, 5, 5};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(nums));
        makeUnique(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static int makeUnique(int[] nums) {
        int uniqueIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            int currentInt = nums[i];
            if (currentInt != nums[uniqueIndex]) {
                nums[i] = nums[++uniqueIndex];
                nums[uniqueIndex] = currentInt;
            }
        }
        return uniqueIndex + 1;
    }


    // Это мой подопытный образец для не сортированного массива
    public static int makeUniqueUnsortedArray(int[] nums) {
        Integer[] uniqueArr = new Integer[nums.length];
        int uniqueIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < uniqueIndex + 1; j++) {
                if (uniqueArr[j] == null) break;
                if (nums[i] == uniqueArr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                nums[uniqueIndex] = nums[i];
                uniqueIndex++;
            }
        }

        return uniqueIndex;
    }
}
