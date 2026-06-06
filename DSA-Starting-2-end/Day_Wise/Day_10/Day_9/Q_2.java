package Day_9;

public class Q_2 {
    public static void main(String[] args) {
        // 2. Remove duplicates from sorted array

        int[] arr = { 5, 5, 6, 6, 8, 8, 10, 10 };
        int index = 1;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i - 1]) {
                arr[index] = arr[i];
                index++;
            }
        }

        for(int i = 0; i < index; i++) {
            System.out.println(arr[i] + " ");
        }


















        // for (int i = 1; i < arr.length; i++) {
        //     if (arr[i] != arr[i - 1]) {
        //         arr[index] = arr[i];
        //         index ++;
        //     }
        // }

        // System.out.println("Array after removing duplicates:");
        // for(int i = 0; i < index; i++) {
        //     System.out.print(arr[i] + " ");
        // }
    }
}






