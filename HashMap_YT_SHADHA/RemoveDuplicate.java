// import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        // REMOVE DUPLICATE FROM ARRAY
        int[] arr = { 6, 8, 7, 6, 8, 7, 10, 9, 10, 8 };
        // HashSet<Integer> set = new HashSet<>();
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num);
        }
        for (int num : set) {
            System.out.println(num);
        }
    }
}



