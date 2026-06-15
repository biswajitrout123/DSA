public class placeTiles {
    public static int placeTile(int n, int m) {
        if(n == m) {
            return 2;
        }
        if(n < m) {
            return 1;
        }

        int verticalPlacement = placeTile(n-m, m);
        int horizontalPlaceent = placeTile(n-1, m);
        return verticalPlacement + horizontalPlaceent;



    }

    public static void main(String[] args) {
        int n = 1;
        int m = 1;        
        System.out.println(placeTile(n, m));
    }
}