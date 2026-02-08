package ARRAY_ALL;

public class Rotate_L_1 {
    public static void main(String[] args) {
        // Left Rotate by 1 - ANTI-CLOCK-WISE
        int[] arr = { 7, 8, 9, 10 };
        int temp = arr[0];              // store first element

        // shift elements to the left
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i + 1];
        }
        // put first element at the end
        arr[arr.length-1] = temp;

       // print array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}






