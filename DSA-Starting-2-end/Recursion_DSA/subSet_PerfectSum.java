package Recursion_DSA;

import java.util.ArrayList;

public class subSet_PerfectSum {
    public static int printPerfectSum(int[] arr, int idx, int sum, int sumTarget, ArrayList<Integer> curr) {
        if(idx == arr.length) {
            if(sum == sumTarget) {
                System.out.println(curr);
                return 1;
            }
            return 0;
        }
        curr.add(arr[idx]);
        int take = printPerfectSum(arr, idx + 1, sum + arr[idx], sumTarget, curr);

        curr.remove(curr.remove(curr.size() - 1));

        int notTake = printPerfectSum(arr, idx + 1, sum, sumTarget, curr);

        return take + notTake;
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 3, 6, 10, 8};
        int count = printPerfectSum(arr, 0, 0, 10, new ArrayList<>());
        System.out.println(count);
    }
}