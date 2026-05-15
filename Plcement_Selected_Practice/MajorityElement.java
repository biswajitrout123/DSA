public class MajorityElement {

    public static void main(String[] args) {
        int[] arr = {3,2,3};
        int count = 0;
        int candidate = 0;
        for(int i = 0; i < arr.length; i++) {
            if(count == 0) {
                candidate = arr[i];
            }
            if(candidate == arr[i]) {
                count++;
            }
            else {
                count--;
            }
        }
        System.out.println(candidate);
        
    }
}