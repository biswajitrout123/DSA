public class two_d_array_multiply {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{1,2,3}};
        int mul = 1;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                int value = arr[i][j];
                mul *= value;
            }
        }
        System.out.println(mul);
    }
}
