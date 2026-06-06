package StriverSheetsPractice.Revice_Array;

public class SingleNumbreOnce {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 3, 1, 4};
        int value = 0;
        for(int i = 0; i < arr.length; i++) {
            value = arr[i] ^ value;

        }
        System.out.println(value);
    }
}
