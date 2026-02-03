package Day_8;

public class Q_4 {
    public static void printArray(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Q-4 Find k-th largest element

        int arr[] = {8,9,10,50,8};
        int k = 3;
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] < arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        
        }
        printArray(arr);

         if (k > 0 && k <= arr.length) {
            System.out.println("K-th largest element = " + arr[k - 1]);
        } else {
            System.out.println("Invalid value of k");
        }
    }
}

