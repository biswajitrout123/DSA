public class Squares_of_a_Sorted_Array {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 7, 10};
        int[] arr2 = new int[arr.length];
        for(int i=0; i < arr.length; i++) {
            arr2[i] = arr[i] * arr[i];
        }
        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}