package Day_3;

public class Q_6 {
    public static void main(String[] args) {
        // Q-6 Count how many elements are smaller than average
        int[] arr = {8, 5, 7, 8, 9, 0, 4, 6, 7, 8, 50};
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        double average = (double) sum / arr.length;
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < average){
                count++;
            }
        }
        System.out.println("Sum of All is " + sum);
        System.out.println("Average is " + average);
        System.out.println("Counta :" + count);
    }
}
