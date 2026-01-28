package Day_5;

public class Q_6 {
    public static void main(String[] args) {
        // Q-6 Rotate array left by 1
        int[] arr = {8, 9, 0, 10, 5, 6, 8, 10};
        int n = arr.length;
        int temp = arr[0];

        for(int i = 0; i < n - 1; i++){
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp;

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}





