package Day_7;

public class Q_3 {

    public static void main(String[] args) {
        // Q-3 Find minimum sum subarray of size k

        
        // int minSum = 0;
        // int windowSum = 0;

        // for (int i = 0; i < k; i++) {
        //     minSum = minSum + arr[i];
        // }
        // windowSum = minSum;

        // for (int i = k; i < arr.length; i++) {
        //     windowSum = windowSum + arr[i] - arr[i - k];
        //     minSum = Math.min(windowSum, minSum);
        // }
        // System.out.println(minSum);

        int[] arr = { 2, 1, 5, 1, 3, 2 };
        int k = 3;

        int minSum = 0;
        int wSum = 0;

        for(int i = 0; i < k; i++) {
            minSum = minSum + arr[i];
        }
        wSum = minSum;

        for(int i = k; i < arr.length; i++) {
            wSum = wSum - arr[i - k] + arr[i];
            minSum = Math.min(wSum, minSum);
        }
        System.out.println(minSum);
    }
}

// Time: O(n)
// Space: O(1)

