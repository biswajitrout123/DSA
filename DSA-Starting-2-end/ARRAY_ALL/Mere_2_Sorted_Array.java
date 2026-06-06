public class Mere_2_Sorted_Array {

    public static void main(String[] args) {
        // MERGE TWO SORTED ARRAY
        int[] arr1 = { 1, 3, 5 };
        int[] arr2 = { 2, 4, 6 };
        int[] merged = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && i < arr2.length) {
            if(arr1[i] < arr2[j]) {
                i = arr1[i];
                i++;
            }
        }

    }
}



