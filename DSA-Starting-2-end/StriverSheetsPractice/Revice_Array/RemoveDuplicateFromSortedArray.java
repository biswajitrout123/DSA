package StriverSheetsPractice.Revice_Array;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {0, 0, 3, 3, 5, 6};
        int i = 0;
        for(int j = 1; j < arr.length; j++) {
            if(arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }
        }
        
        for(int k = 0; k <= i; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
