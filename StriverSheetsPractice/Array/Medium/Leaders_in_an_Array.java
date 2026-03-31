package StriverSheetsPractice.Array.Medium;

import java.util.ArrayList;
import java.util.Collections;

public class Leaders_in_an_Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 1, 2};
        ArrayList<Integer> result = new ArrayList<>();

        int max = Integer.MIN_VALUE;

        for(int i = arr.length -1; i >= 0; i--) {
            if(arr[i] > max) {
                result.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(result);
        System.out.println(result);
        
    }
}
