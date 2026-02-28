package SlidingWindowQs;

public class MaximumSumSubarraySize_K {
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 1, 3, 2};
        int wSum = 0;
        int mSum = Integer.MIN_VALUE;
        int k = 3;
        for(int i = 0; i < k; i++) {
            wSum = wSum + arr[i];
        }
        mSum = wSum;


        
    }
}


