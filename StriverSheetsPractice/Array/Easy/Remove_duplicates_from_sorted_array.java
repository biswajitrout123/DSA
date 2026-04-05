package StriverSheetsPractice.Array.Easy;

public class Remove_duplicates_from_sorted_array {

    public static void main(String[] args) {
        int[] arr = {0, 0, 3, 3, 5, 6};
        int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[index]) {
                index++;
                arr[index] = arr[i];
            }
        }
        System.out.println(index + 1);
        for(int k = 0; k <= index; k++){
            System.out.print(arr[k] + " ");
        }
    }
}