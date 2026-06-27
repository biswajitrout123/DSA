package Recursion_DSA;

import java.util.ArrayList;

/**
 * subsetTargetSum
 */
public class subsetTargetSum {
    public static boolean printTarget(int[] arr, int idx, int target, int sum, ArrayList<Integer> curr) {
        if(idx == arr.length){
            if(sum == target) {
                System.out.println(curr);
                return true;
            }
            return false;
        }

        curr.add(arr[idx]);

        if (printTarget(arr, idx + 1, target, sum + arr[idx], curr)) {
            return true;            
        }
        curr.remove(curr.size() - 1);

        if(printTarget(arr, idx + 1, target, sum, curr)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3, 6, 4, 5};
        boolean ans = printTarget(arr, 0, 12, 0, new ArrayList<>());
        System.out.println(ans);
    }
}