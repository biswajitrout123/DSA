package SlidingWindowQs;

public class MaximumSumSubarraySize_K {
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 1, 3, 2};

        int windowSum = 0;
        int maxSum = 0;
        int k = 3;
        for(int i = 0; i < k; i++) {
            windowSum = windowSum + arr[i];
        }
        maxSum = windowSum;
        for(int i = k; i < arr.length; i++) {
            windowSum = windowSum - arr[i - k] + arr[i];
            maxSum = Math.max(windowSum, maxSum);
        }
        System.out.println(maxSum);

        
    }
}
// int wSum = 0;
//         int mSum = Integer.MIN_VALUE;
//         int k = 3;
//         for(int i = 0; i < k; i++) {
//             wSum = wSum + arr[i];
//         }
//         mSum = wSum;

//         for(int i = k; i < arr.length; i++) {
//             wSum = wSum - arr[i - k] + arr[i];
//             mSum = Math.max(wSum, mSum);
//         }
//         System.out.println(mSum);
