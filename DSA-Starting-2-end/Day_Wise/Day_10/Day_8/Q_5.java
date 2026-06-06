package Day_8;

public class Q_5 {
    public static void main(String[] args) {
        // A-5 Sort only even numbers in array
        int[] arr = { 4, 1, 7, 6, 9, 2 };

        // -------- PHASE 1: Count even numbers --------
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }

        // -------- PHASE 2: Store even numbers --------
        int[] even = new int[count];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even[index] = arr[i];
                index++;
            }
        }

        // -------- PHASE 3: Sort even array (ascending) --------
        for (int i = 0; i < even.length - 1; i++) {
            for (int j = 0; j < even.length - i - 1; j++) {
                if (even[j] > even[j + 1]) {
                    int temp = even[j];
                    even[j] = even[j + 1];
                    even[j + 1] = temp;
                }
            }
        }

        // -------- PHASE 4: Replace sorted evens back --------
        index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = even[index];
                index++;
            }
        }

        // -------- PRINT FINAL ARRAY --------
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }
}
