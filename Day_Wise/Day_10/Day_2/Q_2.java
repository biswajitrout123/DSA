package Day_2;

public class Q_2 {
    public static void main(String[] args) {
        // Q-2 Find index of a given element
        int[] arr = {4,6,8,7,9,10};
        int idx = 7;
        boolean found = false;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == idx){
                System.out.println(i);
                found = true;
                break;
            }
        }
        if(found) {
            System.out.println("Element Found");
        }
        else{
            System.out.println("Element not exist");
        }
    }

}