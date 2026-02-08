package Day_2;

public class Q_6 {
    public static void main(String[] args) {
        // Q-6 Search an element and print “Found” or “Not Found”
        int[] arr = {8, 9, 0, 9, 0, 4, 8, 0, 10};
        int idx = 10;
        boolean found = false;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == idx) {
                found = true;
                break;
            }
        }
        if(found) {
            System.out.println("Element found");
        }
        else{
            System.out.println("Element Not found");
        }
    }
}
