package Day_6;

public class Q_3 {
    public static void main(String[] args) {
        // Q-3 Swap alternate elements
        
        int[] arr = {1, 2, 3, 4, 5, 6, 9};
        for(int i = 0; i + 1 < arr.length; i += 2) {
            int temp = arr[i + 1];
            arr[i + 1] = arr[i];
            arr[i] = temp;
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
