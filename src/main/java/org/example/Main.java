package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 1, 5, 2, 1, 4};
        bubbleSort(nums); // {1, 1, 2, 3, 4, 5}

        System.out.println(Arrays.toString(nums));
    }

    /**
     * Sorts a list of integers in ascending order
     * @param nums the list of integers to be sorted
     */
    public static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i; j++) {
                if (nums[i] > nums[i + j]) {
                    int store = nums[i];
                    nums[i] = nums[i + j];
                    nums[i + j] = store;
                }
            }
        }
    }

    public static void selectionSort(int[] nums) {

    }
}