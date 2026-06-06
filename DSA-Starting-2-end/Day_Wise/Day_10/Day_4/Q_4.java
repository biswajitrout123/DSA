package Day_4;

public class Q_4 {
    public static void main(String[] args) {
        // Q-4 Delete an element from a given index
        int capacity = 10;
        int[] arr = new int[capacity];
        int n = 5;
        arr[0] = 50;
        arr[1] = 60;
        arr[2] = 70;
        arr[3] = 80;
        arr[4] = 90;


        // int del = 60;
        int pos = 1;

        if (pos >= 0 && pos < n) {
            for(int i = pos; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;
        }

        for(int i = 0; i < n; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
