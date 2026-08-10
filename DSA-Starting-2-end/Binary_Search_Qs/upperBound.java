package Binary_Search_Qs;

import java.util.Scanner;

public class upperBound {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter size of Array");
        int n = sc.nextInt();
        System.out.println("Enter Target");
        int k = sc.nextInt();
        System.out.println("Enter Array Elements");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = arr.length -1;
        int ans = arr.length;
        while (left <= right) {
            int mid = left + (right - left) / 2;;
            if(arr[mid] > k) {
                ans = mid;
                right = mid - 1;
            }
            else {
                left = mid + 1;
            }
        }
        System.out.print(ans);    
    }
}
