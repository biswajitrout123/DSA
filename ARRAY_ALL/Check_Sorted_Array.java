package ARRAY_ALL;

public class Check_Sorted_Array {

    public static void main(String[] args) {
        int[] arr = {6,7,8,10};
        
        boolean isSorted = true;
       
        for(int i = 0; i < arr.length -1; i++) {
            if(arr[i] > arr[i + 1]) {
                isSorted = false;
            }
        }
        if(isSorted) {
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not");
        }
    }
}