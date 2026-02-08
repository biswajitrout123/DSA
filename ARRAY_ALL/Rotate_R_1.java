package ARRAY_ALL;

public class Rotate_R_1 {
    public static void main(String[] args) {
        // RIGHT ROTATE BY 1 - CLOCK WISE
        int[] arr = {7,8,9,10};
        int temp = arr[arr.length-1];       // store last element

        // shift elements to the right
        for(int i = arr.length-1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        // put last element at the front
        arr[0] = temp;

        // print array
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


