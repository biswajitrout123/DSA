public class find_last_occurances_of_x {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 5, 3, 5, 4 };
        int x = 5;

        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastIndex = i;
            }
        }
        System.out.println(lastIndex);
    }
}