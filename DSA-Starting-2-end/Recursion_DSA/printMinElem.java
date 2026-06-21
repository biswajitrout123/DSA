package Recursion_DSA;

public class printMinElem {
    public static int printMin(int[] arr, int idx, int min) {
        if(idx == arr.length) {
            return min;
        }
        if(arr[idx] < min) {
            min = arr[idx];
        }

        return printMin(arr, idx + 1, min);
    }
    public static void main(String[] args) {
        int[] arr = {9,8,1,2,6,8,10};
        int min = Integer.MAX_VALUE;
        System.out.println(printMin(arr, 0, min));
        
        
    }
}
