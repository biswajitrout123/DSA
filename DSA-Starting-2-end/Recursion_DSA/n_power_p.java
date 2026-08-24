package Recursion_DSA;

public class n_power_p {
    public static int printPower(int n, int p) {
        if(p == 0) {
            return 1;        
        }
        return n * printPower(n, p-1);
    }
    
    public static void main(String[] args) {
        int n = 2;
        int p = 2;

        int ans = printPower(n, p);
        System.out.println(ans);
    }
}