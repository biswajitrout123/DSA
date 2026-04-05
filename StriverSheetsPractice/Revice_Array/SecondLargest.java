package StriverSheetsPractice.Revice_Array;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {8, 8, 7, 6, 5};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest);
    }
}
