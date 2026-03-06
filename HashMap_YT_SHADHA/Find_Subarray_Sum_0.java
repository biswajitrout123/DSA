import java.util.HashSet;

public class Find_Subarray_Sum_0 {
    public static void main(String[] args) {
        // Find Subarray With Sum = 0
        int arr[] = {4, 2, -3, 1, 6};

        HashSet<Integer> set = new HashSet<>();
        int k = 3;
        int sum = 0;
        for(int num : arr) {
            sum += num;
            if(sum == 0 || set.contains(sum)) {
                System.out.println("Subarray with sum 0 exists");
                return;
            }
            set.add(sum);
        }
        System.out.println("No subarray with sum 0");        
    }
}
