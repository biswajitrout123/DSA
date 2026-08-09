import java.util.ArrayList;

public class two_d_array_Sum_of_Each_Column {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int m = arr.length;
        int n = arr[0].length;

        for(int col = 0; col < n; col++) {
            int sum = 0;
            for(int row = 0; row < m; row++) {
                int value = arr[row][col];
                sum += value;
            }
            list.add(sum);
        }
        System.out.println(list);
    }
}
