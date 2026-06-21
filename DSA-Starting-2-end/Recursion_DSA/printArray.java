package Recursion_DSA;

public class printArray {
    public static void printArray(int[] arr, int idx){
        int n = arr.length;
        
        if(idx == n) {
            return;
        }
        System.out.print(arr[idx] + " ");
        printArray(arr, idx + 1);
    }
    
    public static void main(String[] args) {
        int[] arr = {4,5,6,8,80};
        printArray(arr, 0);
    }
}
