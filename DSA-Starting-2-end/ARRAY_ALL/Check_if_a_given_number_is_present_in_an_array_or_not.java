public class Check_if_a_given_number_is_present_in_an_array_or_not {
    public static boolean isPresent(int[] arr, int q) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == q) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {5, 6, 5, 400, 560, 1000, 400};
        int q = 5;
        System.out.println(isPresent(arr, q));
    }
}
