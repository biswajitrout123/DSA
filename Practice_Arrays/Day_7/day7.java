package Day_7;

public class day7 {
    public static void main(String[] args) {
        // Find sum of all elements of array
        int[] arr = {8, 3, 7, 2, 5};
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}












// 📅 DAY 7 – Sliding Window + Subarrays

// 🎯 Goal: Handle ranges efficiently

// Find sum of all elements of array

// Find maximum sum of subarray of size k

// Find minimum sum subarray of size k

// Check if any subarray has sum equal to given value

// Count number of subarrays

// ✅ You should understand window expand & shrink