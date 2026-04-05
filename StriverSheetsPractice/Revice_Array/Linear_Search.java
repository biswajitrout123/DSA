package StriverSheetsPractice.Revice_Array;

public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 3};
        int target = 3;
        for(int i = 0; i <arr.length; i++) {
            if(arr[i] == target){
                System.out.print(i);
                return;
            }

        }
        System.out.println(-1);
    }
}
