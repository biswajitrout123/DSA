package Binary_Search_Qs;

import java.util.Scanner;

/**
 * Floor_and_Ceil_in_Sorted_Array
 */
public class Floor_and_Ceil_in_Sorted_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array");
        int n = sc.nextInt();
        System.out.println("Enter target");
        int k = sc.nextInt();
        System.out.println("Enter Array Elements");
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int floor = -1;
        int ceil = -1;
        int left = 0;
        int right = arr.length -1;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] == k) {
                floor = arr[mid];
                ceil = arr[mid];
            }
            else if(arr[mid] < k) {
                floor = arr[mid];
                left = mid + 1;
            }
            else {
                ceil = arr[mid];
                right = mid - 1;
            }
        }
        System.out.println(floor);
        System.out.println(ceil);
    }
}