public class move_Zeroes {
    public static void main(String[] args) {
        int[] arr = {4,0,0,7,8,10};
        int left = 0;
        for(int right = 0; right < arr.length; right++) {
            if(arr[right] != 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
            }
        }
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
