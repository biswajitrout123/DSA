package Day_8;

import java.util.*;

public class day8 {
    public static void main(String[] args) {
        // Sort an array (any method)
        int[] arr = { 7, 10, 25, 8, 9, 10 };
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}

// 📅 DAY 8 – Sorting Basics

// 🎯 Goal: Sorting logic (not speed)

// Sort an array (any method)

// Check if array is already sorted

// Sort array in descending order

// Find k-th largest element

// Sort only even numbers in array

// ✅ You should know why sorting helps
