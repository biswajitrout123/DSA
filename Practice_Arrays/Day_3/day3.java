package Day_3;

public class day3 {
    public static void main(String[] args) {
        // Q-1 Find maximum element in an array
        int[] arr = { 8, 9, 0, 5, 6, 8, 10 };
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);

    }
}

// DAY 3 – Maximum, Minimum & Comparisons

// 🎯 Goal: Build comparison thinking

// Q-1 Find maximum element in an array

// Q-2 Find minimum element

// Find second largest element

// Find second smallest element

// Difference between max and min

// Count how many elements are smaller than average

// ✅ You should think: compare & update