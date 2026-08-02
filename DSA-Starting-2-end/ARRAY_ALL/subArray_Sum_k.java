import java.util.HashMap;

public class subArray_Sum_k {
    public static void main(String[] args) {
        int[] arr = {9, 4, 20, 3, 10, 5};

        int k = 33;

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLen = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if(sum == k) {
                maxLen = i + 1;
            }
            int rem = sum - k;

            if(map.containsKey(rem)) {
                int len = i - map.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            if(!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        System.out.println("Longest Length = " + maxLen);        
    }
}
