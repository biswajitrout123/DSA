package Day_3;

public class Q_2 {
    public static void main(String[] args) {
        // Q-2 Find minimum element
        int[] arr = {8, 9, 0, 6, 3, 1, 8, 9, 7, 8, 9, 6, 5, 7, 5, 50};
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}




