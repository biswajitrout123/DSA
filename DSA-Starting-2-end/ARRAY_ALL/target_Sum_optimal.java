import java.util.HashMap;
import java.util.Scanner;

public class target_Sum_optimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of array");
        int n = sc.nextInt();

        System.out.println("Enter Target");
        int target = sc.nextInt();

        System.out.println("Enter Array Elements");
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();        
        int count = 0;
        for(int num : arr) {
            int complement = target - num;

            if(map.containsKey(complement)) {
                count += map.get(complement);
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println(count);
    }
}