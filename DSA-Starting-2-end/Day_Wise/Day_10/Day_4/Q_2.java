package Day_4;

public class Q_2 {
    public static void main(String[] args) {
        // Q-2 Insert an element at the beginning
        int capacity = 10;
        // int[] arr = new int[capacity];
        // int n = 7;
        // arr[0] = 10;
        // arr[1] = 8;
        // arr[2] = 10;
        // arr[3] = 12;
        // arr[4] = 14;
        // arr[5] = 16;
        // arr[6] = 17;

        // int x = 50;

        // if(n < capacity) {
        //     for(int i = n-1; i >= 0; i--){
        //         arr[i + 1] = arr[i];
        //     }
        //     arr[0] = x;
        //     n++;
        // }
        //  for (int i = 0; i < n; i++) {
        //     System.out.println(arr[i]);
        // }

        int[] arr = new int[capacity];
        
        int n = 8;
        arr[0] = 50;
        arr[1] = 60;
        arr[2] = 70;
        arr[3] = 80;
        arr[4] = 90;
        arr[5] = 100;
        arr[6] = 50;
        arr[7] = 60;

        int x = 800;

        if(n < capacity) {
            for(int i = n - 1; i >= 0; i--) {
                arr[i + 1] = arr[i];
            }
            arr[0] = x;
            n++;
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
