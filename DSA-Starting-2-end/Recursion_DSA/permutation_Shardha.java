package Recursion_DSA;
import java.util.ArrayList;

public class permutation_Shardha {
    public static void printPermutation(int[] arr, int idx, ArrayList<Integer> ans) {
        if(idx == arr.length) {
            System.out.println(ans);
            return;
        }
        for(int i = idx; i < arr.length; i++) {
            // swap arr[idx] - arr[i]
            int temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp;

            ans.add(arr[idx]);
            printPermutation(arr, idx + 1, ans);
            ans.remove(ans.size()-1);

            temp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        printPermutation(arr, 0, new ArrayList<>());
    }
}
