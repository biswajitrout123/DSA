package Day_9;

import java.util.HashMap;

public class Q_3 {
    public static void main(String[] args) {
        // 3. Count frequency of each element

        int[] arr = { 8, 9, 0, 10, 5, 6, 8, 7, 9, 40, 10, 8 };

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


        // for(int num : arr) {
        // if(map.containsKey(num)){
        // map.put(num, map.get(num) + 1);
        // }
        // else {
        // map.put(num, 1);
        // }
        // }
        // for(int key : map.keySet()) {
        // System.out.println(key + " -> " + map.get(key));
        // }

    }
}
