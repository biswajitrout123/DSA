public class sum_array_all_elem {
    public static int printSum(int[] arr, int idx, int sum) {
        if(idx == arr.length){
            return sum;
        }

        return printSum(arr, idx + 1, sum + arr[idx]);        
    }
    public static void main(String[] args) {
        int[] arr = {9,10};
        int ans = printSum(arr, 0, 0);
        System.out.println(ans);

    }
}
