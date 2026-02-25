package TWO_POINTER_PROBLEM;

public class PairWithSum {
    public static void main(String[] args) {
        // PAIR WITH GIVEN SUM
        int[] arr = {2, 7, 11, 15};
        int left = 0;
        int right = arr.length-1;
        int target = 9;
        
        while (left < right) {
            int sum = arr[left] + arr[right];
            if(sum == target) {
                System.out.println("Pair found: " + arr[left] + " and " + arr[right]);
                return;
            }
            else if (sum < target) {
                left++;
            }
            else {
                right--;
            }
        }
        System.out.println("No pair found"); 
    }
}
