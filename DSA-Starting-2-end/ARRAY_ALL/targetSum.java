import java.util.Scanner;

/**
 * targetSum
 */
public class targetSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of array");
        int n = sc.nextInt();

        System.out.println("Enter Target");
        int target = sc.nextInt();

        System.out.println("Enter ArrayElements");
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    count++;
                }
            }
        }
        System.out.println("The Count is " + count);
    }
}