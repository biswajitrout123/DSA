package StriverSheetsPractice.Array.Easy;

public class Left_Rotate_Array_by_One {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int temp = arr[0];
        for(int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];

        }
        arr[arr.length - 1] = temp;

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
