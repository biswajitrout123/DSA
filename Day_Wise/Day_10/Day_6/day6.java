package Day_6;

public class day6 {
    public static void main(String[] args) {
        // Q-1 Reverse array using two pointers
        int[] arr = {7, 8, 9, 10};
        int start = 0;
        int end = arr.length-1;
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}











// DAY 6 – Two Pointer Problems

// 🎯 Goal: Think smart, not brute force

// Q-1 Reverse array using two pointers

// Q-2 Check if array is palindrome

// Q-3 Swap alternate elements

// Q-4 Move all negative numbers to one side

// Q-5 Pair sum equals given number (unsorted)

// ✅ You should think: left ↔ right

