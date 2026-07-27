package Queue_Qs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class First_negative_integer_in_every_window_of_size_K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size");
        int n = sc.nextInt();

        System.out.println("Enter elements");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter size of k");
        int k = sc.nextInt();
        if (k <= 0 || k > n) {
            System.out.println("Invalid K");
            return;
        }

        Queue<Integer> q = new LinkedList<>();
        // Store indices of negative numbers in the first window
        for (int i = 0; i < k; i++) {
            if (arr[i] < 0) {
                q.offer(i);
            }
        }

        // Print answer for the first window
        if (q.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(arr[q.peek()]);
        }

        // Slide the window
        for (int i = k; i < n; i++) {
            while (!q.isEmpty() && q.peek() <= i - k) {
                q.poll();                
            }
            // Add current element if it is negative
            if(arr[i] < 0) {
                q.offer(i);
            }

            // Print first negative for the current window
            if (q.isEmpty()) {
                System.out.println(0);
            } else {
                System.out.println(arr[q.peek()]);
            }
        }
        sc.close();
    }
}
