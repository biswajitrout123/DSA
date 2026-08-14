public class prefixSum {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        int sum = arr[0];

        int[] prefixSum = new int[arr.length];

        prefixSum[0] = sum;

        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
            prefixSum[i] = sum;
        }
        for (int i = 0; i < prefixSum.length; i++) {
            System.out.print(prefixSum[i] + " ");
        }
    }
}
