package StriverSheetsPractice.Array.Easy;

public class Single_Number_1I {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4, 3, 1, 4};
        int value = 0;
        for(int i = 0; i < arr.length; i++) {
            value = value ^ arr[i];
        }
        System.out.println(value);
    }
}