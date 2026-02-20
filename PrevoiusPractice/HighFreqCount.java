package PrevoiusPractice;

import java.util.HashMap;

public class HighFreqCount {
    public static void main(String[] args) {
        int[] arr = { 8, 9, 0, 10, 5, 6, 8, 7, 9, 40, 10, 8 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : arr) {
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }
            else {
                map.put(num, 1);
            }
        }
        for(int key : map.keySet()) {
            System.out.println(key + " ->" +  map.get(key));
        }

        
        int highFrequency = 0;
        int highElement = -1;

        for(int key : map.keySet()) {
            if(map.get(key) > highFrequency) {
                highFrequency = map.get(key);
                highElement = key;
            }
        }
        System.out.println(highFrequency);
        System.out.println(highElement);
    }
}

