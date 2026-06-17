public class printLeft_to_right {
    public static void printLeftToRight(int[] arr, int idx) {
        if(idx > arr.length-1){
            return;
        }
        System.out.println(arr[idx] + " ");
        printLeftToRight(arr, idx + 1);
        
    }
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10};
        printLeftToRight(arr, 0);
    }
}

