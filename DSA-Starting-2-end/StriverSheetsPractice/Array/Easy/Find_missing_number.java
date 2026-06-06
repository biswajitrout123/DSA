package StriverSheetsPractice.Array.Easy;

public class Find_missing_number {
    public static void main(String[] args) {
        int[] arr = {0, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int sum = 0;
        int actualSum = (n * (n + 1) ) / 2;
        for(int num : arr) {
            sum += num;
        }
        System.out.println(actualSum - sum);
    }
}