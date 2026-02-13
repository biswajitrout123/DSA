package HashMap_YT_SHADHA;

import java.util.HashSet;

public class InterSection_Array {
    public static void main(String[] args) {
        int[] arr1 = {7, 3, 9};
        int[] arr2 = {6, 3, 9, 2, 9, 4};

        HashSet<Integer> set = new HashSet<>();

        int n1 = arr1.length;
        int n2 = arr2.length;

        int count = 0;

        for(int i = 0; i < n1; i++) {
            set.add(arr1[i]);
        }

        for(int j = 0; j < n2; j++) {
            if(set.contains(arr2[j])) {
                System.out.println(arr2[j]);
                set.remove(arr2[j]);
                count++;
            }
        }

        System.out.println(arr2);
        System.out.println("Count of elements exists is : " + count);
    }
}
