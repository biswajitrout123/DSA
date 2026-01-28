package Day_5;

public class Q_3 {
    public static void main(String[] args) {
        // Q-3 Replace all negative numbers with zero
        int[] arr = {8,0,-1,2,-4,8,60};
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 0){
                arr[i] = 0;
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

