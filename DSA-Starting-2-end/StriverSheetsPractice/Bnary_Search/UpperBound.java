package StriverSheetsPractice.Bnary_Search;

public class UpperBound {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3};
        int x = 2;
        int low = 0;
        int high = nums.length - 1;
        int ans = nums.length;
        while(low <= high) {
            int mid = low +(high - low) / 2;
            if(nums[mid] > x) {
                ans = mid;
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        System.out.println(ans);
    }
}