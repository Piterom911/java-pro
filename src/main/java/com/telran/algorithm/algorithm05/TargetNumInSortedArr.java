package com.telran.algorithm.algorithm05;

public class TargetNumInSortedArr {

    public static void main(String[] args) {
        int[] sortedArr = {-10, -6, -2, 0, 22, 34, 100};
        int target = 2;

        System.out.println(findNum(sortedArr, target));
    }

    public static int findNum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (target < arr[mid]) {
                right = mid - 1;
            }
            if (target > arr[mid]) {
                left = mid + 1;
            }
        }
        return -1;
    }
}
