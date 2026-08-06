public class two_d_array_two {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int[][] brr = {
            {1,2},
            {2,3, 4, 5},
            {3,4, 5, 6, 7},
            {4}
        };

        int rowLength = brr.length;

        for(int row = 0; row <= rowLength -1; row++) {
            // jaise hi main kisi new row me aya
            // same point pr maine uss row ko colLength find out karliya
            // current row -> brr[rowIndex]
            // isme kitne columns -> brr[row].length
            int colLength = brr[row].length;            
            for(int col = 0; col <= colLength -1; col++) {
                System.out.print(brr[row][col] + " ");               
            }
            System.out.println();
        }
    }
}