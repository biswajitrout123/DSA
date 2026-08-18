public class Count_the_number_of_elements_strictly_greater_than_value_x {
    public static void main(String[] args) {
        int[] arr = {2, 7, 5, 6, 3};
        int x = 5;
        int count = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > 5) {
                count++;
            }
        }
        System.out.println(count);
    }
    
}
