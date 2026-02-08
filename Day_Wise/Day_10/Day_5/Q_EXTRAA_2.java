package Day_5;

public class Q_EXTRAA_2 {
    public static void main(String[] args) {
        // FIND SMALLEST & LARGEST
        int[] arr = {7, 4, 3, 2, 3, 5, 76, 34, 1, 90};
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println(smallest);
        System.out.println(largest);
    }
    
}