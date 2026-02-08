package Day_3;

public class Q_5 {
    public static void main(String[] args) {
        // Q-5 Difference between max and min
        int[] arr = {8, 6, 9, 10, 5, 6};
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        int difference = max - min;
        System.out.println("Minium Element is :" + min);
        System.out.println("Maximum Element is :" + max);
        System.out.println("Difference (max-min) is :" + difference);
    }
}
