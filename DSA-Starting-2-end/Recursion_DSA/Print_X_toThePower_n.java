package Recursion_DSA;

public class Print_X_toThePower_n {
    public static int printPower(int x, int n) {
        if(n == 0) {
            return 1;
        }
        if(x == 0) {
            return 0;
        }

        int xPowernm1 = printPower(x, n - 1);

        int xPown = x * xPowernm1;
        return xPown;

    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;

        int ans = printPower(x, n);
        System.out.println(ans);

        
    }
    
}