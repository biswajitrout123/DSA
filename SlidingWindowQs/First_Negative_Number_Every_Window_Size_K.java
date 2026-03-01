package SlidingWindowQs;

public class First_Negative_Number_Every_Window_Size_K {
    public static void main(String[] args) {
        int[] arr = { 12, -1, -7, 8, -15, 30, 16, 28 };
        int k = 3;
        int negative = [arr.length];

        int wSum = 0;
        int mSum = Integer.MIN_VALUE;

        for(int i = 0; i < k; i++) {
            wSum = wSum + arr[i];
            if (arr[i] < 0) {
                negative = arr[i];
                break;
            }
            

        }
        mSum = wSum;

        for(int i = k; i < arr.length; i++) {
            wSum = wSum - arr[i - k] + arr[i];
            mSum = Math.max(mSum, wSum);
        }

        System.out.println(mSum);
    }
}
