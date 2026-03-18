package Day_Wise_Pattern_Wise_All;

public class Print_array_elements_in_reverse_order {
    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 5};
        int n = arr.length - 1;
        for(int i = n; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
