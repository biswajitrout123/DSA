package ARRAY_ALL;

import java.util.HashSet;

public class Remove_Duplicate_UnSorted {
    public static void main(String[] args) {
        // REMOVE DUPLICATE FROM UNSORTED ARRAY
        int[] arr = {5,6,7,4,3,2,3,4,5,6,7,8,7,6,5,4,3,8};
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++) {
            if(!set.contains(arr[i])) {
                set.add(arr[i]);
                System.out.print(arr[i] + " ");
            }
        }
    }
}






