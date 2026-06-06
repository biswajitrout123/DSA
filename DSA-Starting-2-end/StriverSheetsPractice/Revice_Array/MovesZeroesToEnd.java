package StriverSheetsPractice.Revice_Array;

public class MovesZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 4, 0, 5, 2 };
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;

            }
        }
        while (j < arr.length) {
            arr[j] = 0;
            j++;            
        }
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
