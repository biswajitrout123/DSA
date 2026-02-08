package Day_8;

import java.util.*;

public class day8 {
    public static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Sort an array (any method)
        // for (int i = 0; i < arr.length - 1; i++) {
        //     for (int j = 0; j < arr.length - i - 1; j++) {
        //         if (arr[j] > arr[j + 1]) {
        //             int temp = arr[j];
        //             arr[j] = arr[j + 1];
        //             arr[j + 1] = temp;
        //         }
        //     }
        // }
        // System.out.println(Arrays.toString(arr));



        int[] arr = { 7, 10, 25, 8, 9, 10 };
        for(int i = 0; i < arr.length-1; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArray(arr);

    }
}

// 📅 DAY 8 – Sorting Basics

// 🎯 Goal: Sorting logic (not speed)

// Q-1 Sort an array (any method)

// Q-2 Check if array is already sorted

// Q-3 Sort array in descending order

// Q-4 Find k-th largest element

// A-5 Sort only even numbers in array

// ✅ You should know why sorting helps
