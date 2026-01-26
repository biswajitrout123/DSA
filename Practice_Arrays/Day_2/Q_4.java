package Day_2;

public class Q_4 {

    public static void main(String[] args) {
        // Q-4 Find last occurrence of an element
        int[] arr = {8, 7, 6, 9, 0, 7, 8, 9, 0, 8, 9, 0, 8, 10};
        int idx = 8;
        boolean found = false;
        for(int i = arr.length-1; i >= 0; i--) {
            if(arr[i] == idx){
                System.out.println(i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Element not exits");
        }
    }
}
