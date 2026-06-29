package Recursion_DSA;
import java.util.ArrayList;

public class permutation {
    public static void printPermutation(int[] arr, ArrayList<Integer> curr, boolean[] used) {
        if(curr.size() == arr.length) {
            System.out.println(curr);
            return;
        }
        for(int i = 0; i < arr.length; i++) {
            if(!used[i]) {
                used[i] = true;
                curr.add(arr[i]);
                printPermutation(arr, curr, used);
                curr.remove(curr.size() - 1);
                used[i] = false;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        ArrayList<Integer> curr = new ArrayList<>();
        boolean[] used = new boolean[arr.length];
        printPermutation(arr, curr, used);
    }
}