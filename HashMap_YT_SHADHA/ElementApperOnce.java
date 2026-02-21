import java.util.HashMap;

public class ElementApperOnce {
    public static void main(String[] args) {
        // Given an array of integers, find the first element that appears only once.

        int arr[] = { 5, 8, 9, 10, 9, 8, 12 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            int freq = map.getOrDefault(num, 0) + 1;
            map.put(num, freq);
             
        }

        boolean found = false;

        for(int num : arr) {
            if(map.get(num) == 1) {
                System.out.println(num);
                found = true;
                break;
            }
        }

        if(!found) {
            System.out.println("-1");
        }
    }
}
