package DSA_REVISE_ALL.Array_All;

public class Moves_Zero_End {
    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 0, 5, 2};
        int j = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                arr[j] = arr[i];
                j++;
                
            }
        }
        
        while(j < arr.length) {
            arr[j] = 0;
            j++;
        }
        for(int i= 0; i< j; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
