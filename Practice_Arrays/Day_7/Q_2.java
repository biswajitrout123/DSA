package Day_7;

public class Q_2 {
    public static void main(String[] args) {
        // Q-2 Find maximum sum of subarray of size k

        // int windowSum = 0;
        // int maxSum = 0;

        // for (int i = 0; i < k; i++) {
        // windowSum += arr[i];
        // }
        // maxSum = windowSum;

        // for (int i = k; i < arr.length; i++) {
        // windowSum = windowSum + arr[i] - arr[i - k];
        // maxSum = Math.max(maxSum, windowSum);
        // }
        // System.out.println(maxSum);

        // int windowSum = 0;
        // int maxSum = 0;
        // for (int i = 0; i < k; i++) {
        // windowSum += arr[i];
        // }
        // maxSum = windowSum;

        // for (int i = k; i < arr.length; i++) {
        // windowSum = windowSum + arr[i] - arr[i - k];
        // maxSum = Math.max(maxSum, windowSum);
        // }
        // System.out.println(maxSum);

        // DONE BY UNDERSTNDING YT-videos
        int[] arr = { 2, 1, 5, 1, 3, 2 };
        int k = 3;
        int wSum = 0;
        int mSum = Integer.MIN_VALUE;

        for(int i = 0; i < k; i++){
            wSum = wSum + arr[i];
        }
        mSum = wSum;

        for(int i = k; i < arr.length; i++) {
            wSum = wSum - arr[i-k] + arr[i];
            mSum = Math.max(wSum, mSum);
        }

        System.out.println(mSum);
    }
}
