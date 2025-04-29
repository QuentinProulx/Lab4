package org.example;

import java.awt.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 1, 5, 2, 1, 4};
        selectionSort(nums); // {1, 1, 2, 3, 4, 5}

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
                    int temp = nums[i];
                    nums[i] = nums[i + j];
                    nums[i + j] = temp;
                }
            }
        }
    }

    /**
     * Sorts a list of integers in ascending order
     * @param nums the list of integers to be sorted
     */
    public static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int minIdx = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIdx];
            nums[minIdx] = temp;
        }
    }
}
