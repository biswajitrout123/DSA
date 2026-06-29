package Recursion_DSA;

public class way_to_sum_n {
    public static int printSum(int[] arr, int target){
        if(target == 0) {
            return 1;            
        }
        if(target < 0) {
            return 0;
        }
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            count += printSum(arr, target - arr[i]);
        }

        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 6};
        int target = 7;
        System.out.println(printSum(arr, target));        
    }
}
