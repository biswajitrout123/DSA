package StriverSheetsPractice.Array.Easy;

import java.util.ArrayList;

public class Union_of_two_sorted_arrays {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {2, 3, 5, 6}; 

        ArrayList<Integer> union = new ArrayList<>();
        int n1 = arr1.length;
        int n2 = arr2.length;

        int i = 0;
        int j = 0;
        while(i < n1 && j < n2) {
            if(arr1[i] < arr2[j]) {
                if(union.size() == 0 && union.get(union.size() - 1) != arr1[i]) {
                    union.add(arr1[i]);
                }
                i++;
            }
        }









    }
}
// import java.util.*;

// public class UnionArrays {
//     public static void main(String[] args) {
//         int[] arr1 = {1, 2, 3, 4};
//         int[] arr2 = {2, 3, 5, 6};

//         ArrayList<Integer> union = new ArrayList<>();

//         int i = 0, j = 0;

//         while (i < arr1.length && j < arr2.length) {
//             if (arr1[i] <= arr2[j]) {
//                 if (union.size() == 0 || union.get(union.size() - 1) != arr1[i]) {
//                     union.add(arr1[i]);
//                 }
//                 i++;
//             } else {
//                 if (union.size() == 0 || union.get(union.size() - 1) != arr2[j]) {
//                     union.add(arr2[j]);
//                 }
//                 j++;
//             }
//         }

//         // Remaining elements
//         while (i < arr1.length) {
//             if (union.get(union.size() - 1) != arr1[i]) {
//                 union.add(arr1[i]);
//             }
//             i++;
//         }

//         while (j < arr2.length) {
//             if (union.get(union.size() - 1) != arr2[j]) {
//                 union.add(arr2[j]);
//             }
//             j++;
//         }

//         System.out.println(union);
//     }
// }