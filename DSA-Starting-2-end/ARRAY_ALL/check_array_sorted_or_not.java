public class check_array_sorted_or_not {
    public static void main(String[] args) {
        int[] arr = {8, 4, 2, 3, 0, 10};

        boolean isSorted = true;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < arr[i - 1]) {
                isSorted = false;
                break;
            }
        }
        System.out.println(isSorted);
    }
}
