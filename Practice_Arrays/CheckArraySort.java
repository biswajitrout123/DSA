public class CheckArraySort {
    public static void main(String[] args) {
        int[] arr = {8,9,10,20};
        boolean isSorted = true;
        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i] > arr[i + 1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted) {
            System.out.println("Sorted array");
        }
        else { 
            System.out.println("NOT SORTED");
        }
    }
}

