package DSA_REVISE_ALL.Array_All;

public class rotateArray {
    public static void main(String[] args) {
        int[] arr =  {2,7,4,11,5,8};

        int temp = arr[arr.length-1];

        for(int i = arr.length-2; i > 0; i--) {
            arr[i] = arr[i - 1];
    
        }
        arr[0] = temp;

        for(int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
        }        
    }
}
// 8,2,7,4,11,5