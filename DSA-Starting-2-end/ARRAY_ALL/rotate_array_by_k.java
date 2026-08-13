public class rotate_array_by_k {
    public static void reverse(int[] arr, int left, int right) {
        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 5;
        int n = arr.length;
        k = k % n;  //number of steps to rotate

        // 1. Reverse entire array
        reverse(arr, 0, n - 1);

        // 2. Reverse first k elements
        reverse(arr, 0, k - 1);

        // 3. Reverse remaining elements
        reverse(arr, k, n - 1);
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}