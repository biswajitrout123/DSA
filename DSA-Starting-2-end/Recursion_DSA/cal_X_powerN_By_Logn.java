package Recursion_DSA;

public class cal_X_powerN_By_Logn {
    public static int calculatePower(int x, int n) {
        if(n == 0) {
            return 1;
        }
        if(x == 0) {
            return 0;
        }
        int halfPower = calculatePower(x, n/2);

        if(n % 2 == 0) {
            return halfPower * halfPower;
            // or - return calculatePower(x, n/2) * calculatePower(x, n/2) * x;
        }
        else {
            return halfPower * halfPower * x;
            // or - calculatePower(x, n/2) * calculatePower(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int ans = calculatePower(x, n);
        System.out.println(ans);
        
    }
}
