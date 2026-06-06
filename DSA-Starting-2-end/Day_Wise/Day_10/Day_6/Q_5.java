package Day_6;

public class Q_5 {
    public static void main(String[] args) {
        // Q-5 Pair sum equals given number (unsorted)
        int[] arr = {8, 3, 7, 2, 5};
        int target = 10;
        boolean found = false;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    System.out.println("Pair found:" + arr[i] + "+" + arr[j] +  " = " + target );
                    found = true;
                }
            }
        }
        if(!found) {
            System.out.println("No pair found");
        }
    }    
}
