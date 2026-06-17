public class print_right_to_left {
    public static void printRighttoLeft(int[] arr, int idx) {
        if(idx == -1) {
            return;
        }
        System.out.print(arr[idx] + " ");
        printRighttoLeft(arr, idx - 1);
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 9, 10};

        printRighttoLeft(arr, arr.length-1);
    }
}