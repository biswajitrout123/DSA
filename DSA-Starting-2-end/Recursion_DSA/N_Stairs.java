
package Recursion_DSA;

public class N_Stairs {

    public static int printStairs(int n) {
        
        if(n == 0) {
            return 1;
        }
        if(n == 1) {
            return 1;
        }

        return printStairs(n - 1) + printStairs(n - 2);
    }
    public static void main(String[] args) {
        int n = 2;
        System.out.println(printStairs(n));
    }
}