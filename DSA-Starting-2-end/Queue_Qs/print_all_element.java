package Queue_Qs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class print_all_element {
    /**
     * Innerprint_all_element
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            queue.offer(sc.nextInt());
        }
        System.out.println("Queue elements:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll() + " ");
        }
        sc.close();
    }
}