import java.util.ArrayList;

public class two_d_array_find_Sum_Each_Row {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            int sum = 0;
            for(int j = 0; j < arr[i].length; j++) {
                int value = arr[i][j];
                sum += value;
            }
            list.add(sum);
        }
        System.out.println(list);
    }
}
