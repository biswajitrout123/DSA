package Recursion_DSA;

public class printNum_Rev {
    public static void printNumRev(int n){
        if(n == 6) {
            return;
        }
        System.out.print(n + " ");
        printNumRev(n + 1);
    }
    public static void main(String[] args) {
        int n = 1;
        printNumRev(n);
    }
}
