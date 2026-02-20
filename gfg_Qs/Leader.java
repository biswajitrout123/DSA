package gfg_Qs;

public class Leader {
    public static void main(String[] args) {
        // FIND LEADER IN ARRAY
        int[] arr = {7, 10, 4, 10, 6, 5, 2};
        int n = arr.length;
        int maxFromRight = arr[n - 1];
        System.out.println("Leader is " + maxFromRight);
        
        for(int i = n - 2; i >= 0; i--) {
            if(arr[i] > arr[maxFromRight]) {
                arr[maxFromRight] = arr[i];
                System.out.println("Leader is " + arr[i]);
            }
        }

        
    }
}



