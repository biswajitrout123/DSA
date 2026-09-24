/**
 * Move_all_Negatives_to_End
 */
public class Move_all_Negatives_to_End {

    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};
        int[] ans = new int[arr.length];
        int idx = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] >= 0) {
                ans[idx] = arr[i];
                idx++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                ans[idx] = arr[i];
                idx++;                
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ans[i];            
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}