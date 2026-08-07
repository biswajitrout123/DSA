import java.util.ArrayList;

public class two_d_array_Wave_Print {
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
            if(col % 2 == 0) {
                // even - top - button
                for(int row = 0; row < m; row++) {
                    list.add(arr[row][col]);                    
                }

            }else{
                // odd - button - top
                for(int row = m-1; row >= 0; row--) {
                    list.add(arr[row][col]);
                }
            }
        }
        System.out.println(list);

    }
}
