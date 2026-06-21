package Recursion_DSA;

public class linearSearch {
    public static int printIdx(int[] arr, int idx, int target) {
        if (idx == arr.length) {
            return -1;
        }
        if (arr[idx] == target) {
            return idx;
        }
        return printIdx(arr, idx + 1, target);

    }

    public static void main(String[] args) {
        int[] arr = { 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int target = 60;
        System.out.println(printIdx(arr, 0, target));
    }
}