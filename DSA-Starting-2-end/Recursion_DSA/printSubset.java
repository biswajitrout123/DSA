package Recursion_DSA;

import java.util.ArrayList;

public class printSubset {
    public static void printSubset(int[] arr, int idx, ArrayList<Integer> curr) {
        if(idx == arr.length) {
            System.out.println(curr);
            return;
        }

        curr.add(arr[idx]);
        printSubset(arr, idx + 1, curr);
        curr.remove(curr.size() - 1);

        printSubset(arr, idx+1, curr);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        printSubset(arr, 0, new ArrayList<>());
    }
}