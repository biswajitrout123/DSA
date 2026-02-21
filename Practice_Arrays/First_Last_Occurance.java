public class First_Last_Occurance {
    public static void main(String[] args) {
        // First and Last Occurrence of Element
        int[] arr = {1,2,2,2,3,4,5};
        int target = 2;
        int n = arr.length-1;
        // int lastOccurance = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                System.out.println("First Occurance at index is : " + i);
                break;
            }
        }
        for(int i = n; i >= 0; i--) {
            if(arr[i] == target) {
                System.out.println("Last Occurance at index is : " + i);
                break;
            }
        }
    }
}




