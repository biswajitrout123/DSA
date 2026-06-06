package Day_4;

public class Q_6 {
    public static void main(String[] args) {
        // Q-6 Remove all occurrences of a given value
        int capacity = 10;
        int[] arr = new int[capacity];
        int n = 7;
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 60;
        arr[3] = 60;
        arr[4] = 50;
        arr[5] = 60;
        arr[6] = 70;
        
        int x  = 60;
        int k = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] != x){
                arr[k] = arr[i];
                k++;
            }
        }
        n = k;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}


