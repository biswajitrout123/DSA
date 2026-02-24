import java.util.HashMap;

public class Count_Frequency {
    public static void main(String[] args) {
        int[] arr = { 4, 4, 5, 5, 3, 3, 2, 2, 2, 3, 8, 9, 7, 10 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        for(int key : map.keySet()) {
            System.out.println(key + "->" + map.get(key));
        }

    }
}
