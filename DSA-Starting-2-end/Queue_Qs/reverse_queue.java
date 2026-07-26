package Queue_Qs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class reverse_queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();
        System.out.println("Enter no of elements");
        int n = sc.nextInt();
        System.out.println("Enter the elements");
        int[] ans = new int[n];
        for(int i = 0; i < n; i++) {
            queue.offer(sc.nextInt());
        }
        for(int i = 0; i < n; i++) {
            ans[i] = queue.poll();
        }
        for(int i = n - 1; i >= 0; i--) {
            queue.offer(ans[i]);    
        }
        while(!queue.isEmpty()) {
            System.out.println(queue.poll() + " ");
        }
    }
}