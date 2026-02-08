package Day_5;

public class Q_2 {
    public static void main(String[] args) {
        // Q-2 Copy one array into another
        int[] arr = {7,8,9,0,10};
        int[] arr2 = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }
    }
}




