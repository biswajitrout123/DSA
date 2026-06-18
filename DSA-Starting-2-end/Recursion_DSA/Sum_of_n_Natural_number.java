package Recursion_DSA;

public class Sum_of_n_Natural_number {
    public static int printSum(int n, int sum, int idx) {

        if(idx > n) {
            return sum;
        }
        return printSum(n, sum + idx, idx+1);        
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println(printSum(n, 0, 0));

    }
}