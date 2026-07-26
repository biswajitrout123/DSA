package Queue_Qs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class reverseFirst_K_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n = sc.nextInt();
        System.out.println("Enter elements");
        int[] arr = new int[n];
        System.out.println("Enter k");
        int k = sc.nextInt();
        if (k > n || k < 0) {
            System.out.println("K is invalid");
            return;
        }
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            queue.offer(sc.nextInt());
        }
        for (int i = 0; i < k; i++) {
            stack.push(queue.poll());
        }
        while (!stack.isEmpty()) {
            queue.offer(stack.pop());
        }
        for (int i = 0; i < n - k; i++) {
            queue.offer(queue.poll());
        }
        System.out.println("Queue after reversing first " + k + " elements:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
