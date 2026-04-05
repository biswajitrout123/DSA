package StriverSheetsPractice.Revice_Array;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {0, 2, 3, 1, 4};
        int n = arr.length;
        int sum = 0;
        int actualSum = n * (n + 1) / 2;
        for(int num : arr) {
            sum += num;
        }
        System.out.print(actualSum - sum);
    }
}
