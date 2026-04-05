package StriverSheetsPractice.Array.Easy;

public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 3 };
        int target = 3;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
