package StriverSheetsPractice.Revice_Array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LeadersArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 1, 2};
        List<Integer> ans = new ArrayList<>();
    
        int max = Integer.MIN_VALUE;
        for(int i = arr.length-1; i >=0; i--) {
            if(arr[i] >= max) {
                ans.add(arr[i]);
                max = arr[i];
            }
        }
        Collections.reverse(ans);
        System.out.print(ans + " ");
        
    }
}