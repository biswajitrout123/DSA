package Recursion_DSA;

public class binarySearch {
    public static int solveBinary(int[] arr, int left, int right, int target) {

        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            return mid;
        }
        if (arr[mid] < target) {
            return solveBinary(arr, mid + 1, right, target);
        } else {
            return solveBinary(arr, left, mid - 1, target);
        }
    }
    public static void main(String[] args) {
        int[] arr = { 3, 8, 11, 15, 20, 22 };
        int left = 0;
        int right = arr.length - 1;
        int ans = solveBinary(arr, left, right, 20);
        System.out.println(ans);
    }
}