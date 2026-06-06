public class Search_Rotate_Sortated {

    public static int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if(arr[mid] == target) {
                return mid;
            }
            // CHECK FOR LEFT PART SORTED
            if(arr[low] <= arr[mid]) {
                if(target >= arr[low] && target < arr[mid]) {
                    high = mid - 1;
                }
                else {
                    low = mid + 1;
                }

            }
            else {
                // TARGET >= MID
                if (target > arr[mid] && target <= arr[high]) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Search in rotated sorted array
        int[] arr = { 7, 8, 9, 1, 2, 3, 4, 5, 6 };
        int target = 1;
        // search(arr, target);
        System.out.println(search(arr, target));
        
    }
}
