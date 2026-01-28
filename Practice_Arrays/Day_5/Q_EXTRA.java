package Day_5;

public class Q_EXTRA {
    public static void main(String[] args) {
//  Separate even and odd numbers
// (keep even first, then odd)

        int[] arr = {8, 6, 7, 3, 5, 2, 9, 0, 11, 20, 10, 80, 50, 34, 33, 13, 43, 42, 60};
        int k = 0;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] %2 == 0){
                arr[k] = arr[i];
                k++;
            }
        }
        while(arr[i] %2 != 0){
            arr[k] = arr[i];
            k++;
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
