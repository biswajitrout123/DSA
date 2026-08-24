package Recursion_DSA;

public class fact_n {
    public static int printFact(int n) {

        if(n == 1) {
            return 1;
        }
        if(n == 0) {
            return 1;
        }  

        return n * printFact(n - 1);
    }
    public static void main(String[] args) {
        int n = 0;
        int ans = printFact(n);
        System.out.println(ans);        
    }
}