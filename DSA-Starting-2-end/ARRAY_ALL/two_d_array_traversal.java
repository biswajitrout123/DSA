public class two_d_array_traversal {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        int[][] brr = {
            {1,2},
            {2,3},
            {4,6}
        };
        int rowLength = brr.length;
        
        // TRAVERSE 2-D ARRAY
        for(int row = 0; row < rowLength; row++) {
            for(int col = 0; col < brr[row].length; col++) {
                System.out.print(brr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
