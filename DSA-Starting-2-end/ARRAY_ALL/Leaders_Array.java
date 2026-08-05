import java.util.Collection;
import java.util.Scanner;

public class Leaders_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements");
        int n = sc.nextInt();

        System.out.println("Enter array Elements");
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] ans = new int[n];
        int count = 0;
        
        // Last element is always a leader
        int leader = arr[n - 1];
        ans[count++] = leader;

        // Traverse from right to left
        for(int i = n - 2; i >= 0; i--) {
            if(arr[i] >= leader) {
                leader = arr[i];
                ans[count++] = leader;
            }
        }
        System.out.println("Leaders are:");
        for(int i = count - 1; i >= 0; i--) {
            System.out.println(ans[i] + " ");
        }
    }
}