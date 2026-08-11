package Binary_Search_Qs;

/**
 * Count_Occurrences_in_a_Sorted_Array
 */
public class Count_Occurrences_in_a_Sorted_Array {
    public static int lowerBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length-1;
        int ans = arr.length;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] >= target) {
                ans = mid;
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return ans;
    }

    public static int upperBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length -1;
        int ans = arr.length;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] > target) {
                ans = mid;
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 2, 3};
        int target = 1;
        int first = lowerBound(arr, target);
        int second = upperBound(arr, target);
        int count = second - first; 
        System.out.println(count);
    }
}