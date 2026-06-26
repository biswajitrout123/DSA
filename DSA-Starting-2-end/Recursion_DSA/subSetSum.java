package Recursion_DSA;

import java.util.ArrayList;

public class subSetSum {
    ArrayList<Integer> result = new ArrayList<>();
    public static void printSum(int[] arr, int idx, int sum, ArrayList<Integer> curr) {
        if(idx == arr.length){
            System.out.println(curr + " - > " + sum);
            return;
        }
        curr.add(arr[idx]);
        printSum(arr, idx + 1, sum + arr[idx], curr);
        curr.remove(curr.size()-1);

        printSum(arr, idx + 1, sum, curr);
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 5};
        printSum(arr, 0, 0, new ArrayList<>());        
    }
}