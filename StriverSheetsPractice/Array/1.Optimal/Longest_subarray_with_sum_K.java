import java.util.HashMap;

public class Longest_subarray_with_sum_K {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;

        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

            if(sum == k) {
                maxLen = i + 1;
            }
            if(map.containsKey(sum - k)) {
                int len = i - map.get(sum - k);
                maxLen = Math.max(maxLen, len);
                
            }
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }
        System.out.println("Longest length: " + maxLen);
    }
}
