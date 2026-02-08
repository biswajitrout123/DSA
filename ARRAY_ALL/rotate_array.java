package ARRAY_ALL;

public class rotate_array {
    // Rotate Array
    public static void main(String[] args) {
        int[] arr = {7,8,9,10};
        int temp = arr[0];
        for(int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length-1] = temp;
        
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}






