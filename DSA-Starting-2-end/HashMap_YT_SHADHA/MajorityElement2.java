import java.util.HashMap;

public class MajorityElement2 {
    public static void main(String[] args) {
        // Find all elements that appear more than n/2 times (Majority Element).
        int[] arr = {3, 3, 4, 2, 3, 3, 3};

        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        for(int num : arr) {
            int freq = map.getOrDefault(num, 0) + 1;
            map.put(num, freq);

            if(freq > n/2) {
                System.out.println(num);
                break;
            }
        }
    }
}

