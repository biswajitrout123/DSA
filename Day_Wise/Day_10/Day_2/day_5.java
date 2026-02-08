package Day_2;

public class day_5 {
    public static void main(String[] args) {
        // Q-5 Count frequency of a given element
        int[] arr = {8, 9, 0, 4, 6, 5, 8, 5, 10};
        int idx = 5;
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == idx) {
                count++;
            }
        }
        if(count > 0) {
            System.out.println("Frequency of element is: " + count);
        }else{
            System.out.println("Element not found");
        }
    }
}
