public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {8, 9, 10, 12, 60};
        int findEle = 12;
        boolean isFound = false;
        int idx = -1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == findEle) {
                isFound = true;
                idx = i;
                break;
            }
        }

        if(isFound) {
            System.out.println("Element found!" + idx);
        }
        else{
            System.out.println("Element not found!" + idx);
        }

    }
}


