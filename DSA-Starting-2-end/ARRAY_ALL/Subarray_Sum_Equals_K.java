import java.util.HashMap;

public class Subarray_Sum_Equals_K {

    public static void main(String[] args) {

        int[] arr = {1, 1, 1};
        int k = 2;

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int count = 0;

        // Important: prefix sum 0 already exists once
        map.put(0, 1);

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            // Check if a previous prefix sum exists
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            // Store current prefix sum
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println("Number of subarrays = " + count);
    }
}