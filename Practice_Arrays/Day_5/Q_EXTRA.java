package Day_5;

public class Q_EXTRA {
    public static void main(String[] args) {
//  Separate even and odd numbers
// (keep even first, then odd)

        int[] arr = {10,9,6,3,5,20};
        int[] temp = new int[arr.length];

        int k = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] %2 == 0){
                temp[k++] = arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] %2 != 0){
                temp[k++] = arr[i];
            }
        }

        for(int i = 0; i < arr.length; i++){
            arr[i] = temp[i];
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

