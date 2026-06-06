package StriverSheetsPractice.Array.Easy;

// BRUTE FORCEAPPROACH
public class Longest_subarray_with_sum_K {
    public static void main(String[] args) {
        int[] arr = { 10, 5, 2, 7, 1, 9 };
        int k = 15;
        int maxlen = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum = sum + arr[j];
                if (sum == k) {
                    maxlen = Math.max(maxlen, j - i + 1);
                }
            }
        }
        System.out.println("Longest length: " + maxlen);
    }
}
