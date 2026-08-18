/**
 * two_d_array_addititon_two_metrices
 */
public class two_d_array_addititon_two_metrices {

    public static void main(String[] args) {
        int[][] arr1 = {
                { 1, 2, 3 },
                { 7, 8, 9 }
        };
        int[][] arr2 = {
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int[][] result = new int[2][3];

        for (int row = 0; row < arr1.length; row++) {
            for (int col = 0; col < arr1[0].length; col++) {
                result[row][col] = arr1[row][col] + arr2[row][col];
            }
        }

        // Print result
        for (int row = 0; row < result.length; row++) {
            for (int col = 0; col < result[0].length; col++) {
                System.out.print(result[row][col] + " ");
            }
            System.out.println();
        }
    }
}