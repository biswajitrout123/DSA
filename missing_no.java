public class missing_no {

    public static void main(String[] args) {
        int[] arr = {2,1,3,0,6,4,5};
        int n = arr.length;
        int sum = 0;
        int actual = (n * (n + 1)) / 2; 
        for(int num : arr) {
            sum = sum + num;
        }
        // System.out.println("Missing num is:" + actual - sum);
        System.out.println("Missing num is : " + (actual - sum));
    }
}