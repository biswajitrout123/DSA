package Day_3;

public class Q_4 {
    public static void main(String[] args) {
        // Q-4 Find second smallest element
        int[] arr = {8, 7, 0, 2, 4, 5, 6, 80, 1, 2, 12};
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) { 
            if(arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if (arr[i] > smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        System.out.println("Smallest Element :" + smallest);
        System.out.println("Second Smallest Element is:" + secondSmallest);
    }
}
