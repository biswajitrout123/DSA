public class Move_0_to_End {
    public static void main(String[] args) {
        // MOVE ZEROES TO END
        int[] arr = {0,8,6,7,9,0,4,0,8};
        int index = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        while (index != arr.length) {
            arr[index] = 0;
            index++;
        }

        for(int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
