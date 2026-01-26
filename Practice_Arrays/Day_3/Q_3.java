package Day_3;

public class Q_3 {
    public static void main(String[] args) {
        // Q-3 Find second largest element
        int[] arr = {8, 5, 6, 7, 4, 2, 5, 6, 9, 10};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
        }
        System.out.println("Largest Element is :" + largest);
        System.out.println("Second Largest Element is:" + secondLargest);
    }
}

