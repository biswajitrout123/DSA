package Day_9;

import java.util.HashMap;

public class Q_5 {
    public static void main(String[] args) {
        // 5. Find unique element
        int[] arr = { 7, 7, 8, 8, 10, 10, 6 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        for(int key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        for(int key : map.keySet()) {
            if(map.get(key) == 1) {
                System.out.println("Unique Element is : " + key);
            }
        }

    }
}
