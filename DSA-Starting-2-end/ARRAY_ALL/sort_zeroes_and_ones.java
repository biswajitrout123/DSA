public class sort_zeroes_and_ones {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 0, 1, 1, 0, 0};
        int count = 0;
        
        // COUNT NUMBER OF ZEROES
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                count++;
            }
        }
        
        // Put zeroes
        for(int i = 0; i < count; i++) {
            arr[i] = 0;
        }

        // Put ones
        for(int i = count; i < arr.length; i++) {
            arr[i] = 1;
        }

        // Print
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}