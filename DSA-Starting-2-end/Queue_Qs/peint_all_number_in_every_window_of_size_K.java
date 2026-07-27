package Queue_Qs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class peint_all_number_in_every_window_of_size_K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array");
        int n = sc.nextInt();

        System.out.println("Enter Elements");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter window size k");
        int k = sc.nextInt();

        if (k <= 0 || k > n) {
            System.out.println("Invalid window size");
            return;
        }

        Queue<Integer> q = new LinkedList<>();
        // Fill first window
        for (int i = 0; i < k; i++) {
            q.offer(arr[i]);
        }
        // Print first window
        for (int num : q) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Slide the window
        for (int i = k; i < n; i++) {
            q.poll();               //Remove the oldest element
            q.offer(arr[i]);        // Add the new element

            for (int num : q) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}