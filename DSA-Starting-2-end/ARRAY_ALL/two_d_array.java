/**
 * two_d_array
 */
public class two_d_array {

    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        int[][] brr = {
            {1,2},
            {2,3},
            {3,4},
            {4,5}
        };
        System.out.println(brr[3][1]);

        int rowLength = brr.length;
        int colLength = brr[0].length;

        for(int row = 0; row <= rowLength - 1; row++) {
            for(int col = 0; col <= colLength -1; col++) {
                System.out.print(brr[row][col] + " ");
            }
            System.out.println();           
        }
    }
}