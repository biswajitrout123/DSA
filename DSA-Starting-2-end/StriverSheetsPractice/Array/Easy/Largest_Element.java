package StriverSheetsPractice.Array.Easy;

public class Largest_Element {
    public static void main(String[] args) {
        int[] arr = {3, 3, 0, 99, -40};
        int largest = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println(largest);
    }
}
