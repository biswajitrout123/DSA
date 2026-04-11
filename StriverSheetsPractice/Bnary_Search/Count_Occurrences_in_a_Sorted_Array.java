package StriverSheetsPractice.Bnary_Search;

public class Count_Occurrences_in_a_Sorted_Array {

    public int lowerBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public int upperBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > target) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public int countOccurrences(int[] arr, int target) {
        int first = lowerBound(arr, target);

        if (first == arr.length || arr[first] != target) {
            return 0;
        }

        int last = upperBound(arr, target);
        return last - first;
    }

    public static void main(String[] args) {
        Count_Occurrences_in_a_Sorted_Array obj = new Count_Occurrences_in_a_Sorted_Array();

        int[] arr = {0, 0, 1, 1, 1, 2, 3};
        int target = 1;

        int result = obj.countOccurrences(arr, target);
        System.out.println("Count: " + result);
    }
}