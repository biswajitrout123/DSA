package ARRAY_ALL;

public class reverse_array {

    public static void main(String[] args) {
        // Reverse Array
        int[] arr = {9,10,11,12};
        int start = 0;
        int end = arr.length-1;
        
            while(start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            for(int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
    }
}


