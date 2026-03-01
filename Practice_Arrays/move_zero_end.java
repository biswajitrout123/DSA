public class move_zero_end {
    public static void main(String[] args) {
        int arr[] = {4, 0, 2, 0, 3, 0, 2, 0, 8};
        int k = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                arr[k] = arr[i];
                k++;
            }
        }
        while (k < arr.length) {
            arr[k] = 0;
            k++;
        }

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


