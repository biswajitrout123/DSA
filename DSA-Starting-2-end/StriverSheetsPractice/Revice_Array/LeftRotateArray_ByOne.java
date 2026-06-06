package StriverSheetsPractice.Revice_Array;

public class LeftRotateArray_ByOne {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int temp = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp;

        for (int num : arr) {
            System.out.print(num+ " ");
        }
    }
}
