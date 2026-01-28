public class Main {
    public static void main(String[] args) {
        // Q-5 Separate even and odd numbers
        int[] arr = {8,7,50,3,56,8,90,55};
        int[] temp = new int[arr.length];
        int k = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] %2 == 0) {
                temp[k++] = arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] %2 != 0) {
                temp[k++] = arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++){
            arr[i] = temp[i];
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}





