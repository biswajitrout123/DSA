package Recursion_DSA;

public class min_Num_find {
    public static int printMin(int[] arr, int idx) {

        if(idx == arr.length-1){
            return arr[idx];
        }
        int minFromRest = printMin(arr, idx+1);

        return Math.min(arr[idx], minFromRest);
    }
    public static void main(String[] args) {
        int[] arr = {7, 2, 4, 1, 6};
        System.out.println(printMin(arr, 0));
        
    }
}