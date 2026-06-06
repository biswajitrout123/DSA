public class Largest_Array {
    public static void main(String[] args) {
        // Largest in Array
        int[] arr = {1, 8, 7, 56, 90};
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
