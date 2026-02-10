package HashMap_YT_SHADHA;

import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // INSERTION
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);

        System.out.println(map);
        
        map.put("China", 180);
        System.out.println(map);


        // SEARCH
        if(map.containsKey("China")) {
            System.out.println("Key is present in the map");
        }
        else {
            System.out.println("Key is not present in the map");
        }
    }
}








