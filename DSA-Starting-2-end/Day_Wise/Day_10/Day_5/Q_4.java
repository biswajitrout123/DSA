package Day_5;

public class Q_4 {
    public static void main(String[] args) {
        // Q- 4 Move all zeros to the end
        int[] arr = {6, 8, 7, 8, 0, 0, 2, 6, 8, 0, 10, 50, 20};

        int k = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[k] = arr[i];
                k++;
            }
        }
        while(k < arr.length){
            arr[k] = 0;
            k++;
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

