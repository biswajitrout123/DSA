package Recursion_DSA;

public class printMaxElem {
    public static int printMax(int[] arr, int idx, int max) {
        
        if(idx == arr.length) {
            return max;
        }
        if(arr[idx] > max){
            max = arr[idx];
        }
        return printMax(arr, idx+1, max);
    }
    
    
    public static void main(String[] args) {
        int arr[] = {5, 600, 7, 8, 9, 10};
        int max = Integer.MIN_VALUE;
        System.out.println(printMax(arr, 0, 0));

    }
}
