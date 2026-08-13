public class squares_of_array_with_negative_numbers {
    public static void main(String[] args) {
        int[] arr = { -10, -3, -2, 1, 4, 5 };
        int n = arr.length;

        int left = 0;
        int right = arr.length - 1;
        int[] ans = new int[n];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[i] = arr[left] * arr[left];
                left++;
            } else {
                ans[i] = arr[right] * arr[right];
                right--;
            }
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}

