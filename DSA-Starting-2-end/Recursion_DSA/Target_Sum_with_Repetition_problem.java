package Recursion_DSA;

/**
 * Target_Sum_with_Repetition_problem
 */
public class Target_Sum_with_Repetition_problem {
    public static int printSum(int[] arr, int idx, int sum) {
        if (sum == 0) {
            return 1;
        }
        if(sum < 0) {
            return 0;
        }
        if (idx == arr.length) {
            return 0;
        }
        int take = printSum(arr, idx, sum - arr[idx]);

        int notTake = printSum(arr, idx + 1, sum);
        return take + notTake;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4 };
        int sum = 6;
        System.out.println(printSum(arr, 0, sum));
    }
}