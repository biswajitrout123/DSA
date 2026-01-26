package Day_2;

public class Q_3 {
    public static void main(String[] args) {
        // Q-3 Find first occurrence of an element
        int[] arr = {8, 0, 7, 7, 8, 10};
        int idx = 7;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == idx){
                System.out.println(i);
                break;
            }
        }
    }
}
