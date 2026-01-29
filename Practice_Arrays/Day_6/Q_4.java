package Day_6;

public class Q_4 {
    public static void main(String[] args) {
        // Q-4 Move all negative numbers to one side
        int[] arr = {8, 1, -2, 3, -4, -5, 6, 60};
        int k = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0) {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k++;
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
