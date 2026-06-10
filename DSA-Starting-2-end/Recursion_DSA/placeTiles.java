public class placeTiles {
    public static int placeTile(int n, int m) {
        if(n == m) {
            return 2;
        }
        if(n < m) {
            return 1;
        }
        int vertically = placeTile(n - m, m);
        int horizontlly = placeTile(n - 1, m);

        return vertically + horizontlly;
    }
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        System.out.println(placeTile(n, m));
        
    }
}