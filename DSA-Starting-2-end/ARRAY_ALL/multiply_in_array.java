public class multiply_in_array {
    public static int printMultiply(int[] arr, int idx, int multiply) {
        if (idx == arr.length) {
            return multiply;
        }
        return printMultiply(arr, idx + 1, multiply * arr[idx]);
    }

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 8 };
        int mul = printMultiply(arr, 0, 1);
        System.out.println(mul);
    }
}
