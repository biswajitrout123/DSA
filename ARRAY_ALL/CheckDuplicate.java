package ARRAY_ALL;

public class CheckDuplicate {

    // CHECK DUPLICATE EXIST OR NOT
    public static void main(String[] args) {
        int[] arr = {8,9,10,10};
        boolean isFound = false;
        for(int i = 0; i < arr.length-1; i++) {
            if(arr[i] == arr[i + 1]) {
                isFound = true;
            }
        }
        if(isFound) {
            System.out.println("Duplicate found");
        }
        else{
            System.out.println("Duplicate not found");
        }
    }
}
