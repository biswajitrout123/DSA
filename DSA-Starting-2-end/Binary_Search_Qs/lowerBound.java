package Binary_Search_Qs;

import java.util.Scanner;

public class lowerBound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        System.out.println("Entar Target");
        int K = sc.nextInt();
        System.out.println("Enter Array Elements");
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        

        int left = 0;
        int right = arr.length -1;
        int ans = arr.length;
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] >= K) {
                ans = mid;
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        System.out.println(ans);
    }
}
