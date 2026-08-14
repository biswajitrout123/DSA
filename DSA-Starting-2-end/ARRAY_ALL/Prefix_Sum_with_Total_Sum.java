public class Prefix_Sum_with_Total_Sum {
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 6, 3, 1};

        int total = 0;

        // Calculate total sum
        for(int i = 0; i < arr.length; i++){
            total += arr[i];
        }

        // Calculate total sum
        int prefix = 0;
        
        for(int i = 0; i < arr.length - 1; i++) {
            prefix += arr[i];
            int suffix = total - prefix;

            if(prefix == suffix) {
                System.out.println("True");
                return;
            }
        }
        System.out.println("False");        
    }
    
}
