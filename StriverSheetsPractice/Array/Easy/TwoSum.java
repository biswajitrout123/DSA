package StriverSheetsPractice.Array.Easy;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1, 6, 2, 10, 3};
        int target = 7;
        for (int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    System.out.println(i  + " " + j);
                    return;
                }
            }            
        }
    }
}
