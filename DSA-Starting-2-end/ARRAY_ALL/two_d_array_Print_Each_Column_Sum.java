import java.util.ArrayList;

public class two_d_array_Print_Each_Column_Sum {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr[0].length; i++) {
            int sum = 0;
            for(int j = 0; j < arr.length; j++) {
                int value = arr[j][i];
                sum += value;
            }
            list.add(sum);
        }
        System.out.println(list);
    }
}
