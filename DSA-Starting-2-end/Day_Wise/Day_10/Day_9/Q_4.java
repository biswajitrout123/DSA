package Day_9;

import java.util.HashMap;

public class Q_4 {
    public static void main(String[] args) {
        // 4. Find element with highest frequency
        int[] arr = { 8, 9, 0, 10, 5, 6, 8, 7, 9, 40, 10, 8 };

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        for (int key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
        int maxFreq = 0;
        int maxElement = -1;

        // Step 2: Find highest frequency
        for (int key : map.keySet()) {
            if (map.get(key) > maxFreq) {
                maxFreq = map.get(key);
                maxElement = key;

            }
        }
        System.out.println("Element with highest frequency: " + maxElement);
        System.out.println("Frequency: " + maxFreq);

    }
}









