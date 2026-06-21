package Recursion_DSA;

public class count_Element_in_Array {
    public static int countElment(int[] arr, int idx, int target, int count) {
        if(idx == arr.length) {
            return count;
        }
        if(arr[idx] == target) {
            count = count + 1;
        }
        return countElment(arr, idx + 1, target, count);
    }
    public static void main(String[] args) {
        int[] arr = {6,7,8,9,10,10,10,10,10,10,10,10,10,10};
        int target = 10;
        int count = countElment(arr, 0, target, 0);
        System.out.println(count);
    }
}