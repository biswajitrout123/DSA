package Day_4;

public class Q_5 {
    public static void main(String[] args) {
        // Q-5 Delete first occurrence of a value
        int capacity = 6;
        int[] arr = new int[capacity];
        int n =5;

        arr[0] = 50;
        arr[1] = 60;
        arr[2] = 70;
        arr[3] = 60;
        arr[4] = 100;

        int x = 60;
        int pos = -1;

        for(int i = 0; i < n; i++){
            if(arr[i] == x){
                pos = i;
                break;
            }
        }

        if(pos != -1) {
            for(int i = pos; i < n - 1; i++){
                arr[i] = arr[i + 1];
            }
            n--;
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

