package Day_8;

public class Q_2 {
    public static void main(String[] args) {
        // Check if array is already sorted
        int[] arr = {5,5,5,5,5};
        boolean sorted = true;

        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i + 1]){
                sorted = false;
                break;
            }
        }
        if(sorted) {
            System.out.println("Array is Sorted");
        }
        else {
            System.out.println("Array is not sorted");
        }


        
    }
}
