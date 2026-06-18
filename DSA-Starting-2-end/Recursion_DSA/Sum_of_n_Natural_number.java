package Recursion_DSA;

public class Sum_of_n_Natural_number {
    public static int printSum(int n) {
        if(n == 0) {
            return 0;
        }
        
        return n + printSum(n - 1);
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println(printSum(n));

    }
}