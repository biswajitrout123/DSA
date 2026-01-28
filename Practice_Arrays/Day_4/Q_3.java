package Day_4;

public class Q_3 {
    public static void main(String[] args) {
        // Q-3 Insert an element at a given index
        int capacity = 10;
        int[] arr = new int[capacity];
        int n = 5;
        arr[0] = 50;
        arr[1] = 60;
        arr[2] = 70;
        arr[3] = 80;
        arr[4] = 100;

        int x = 40; // ELEMENT TO INSERT
        int pos = 2; // POSITION TO INSERT

        if (n < capacity && pos >= 0 && pos <= n) {
            for (int i = n - 1; i >= pos; i--) {
                arr[i + 1] = arr[i];
            }
            arr[pos] = x;
            n++;

        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }
}
