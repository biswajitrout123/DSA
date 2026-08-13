public class sort_0s_1s_TwoPointer {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 0, 1, 0, 1, 1, 0 };
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {

            // Find 1 from lef
            while (left < right && arr[left] == 0) {
                left++;
            }

            // Find 0 from right
            while (left < right && arr[right] == 1) {
                right--;
            }

            // SWAP
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
