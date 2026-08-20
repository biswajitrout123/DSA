package Recursion_DSA;

public class fibonaci_series {
    public static void printFibonacci(int n, int a, int b) {
        if(n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        printFibonacci(n - 1, b, c);
    }
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 8;
        printFibonacci(n - 2, a, b);
    }
}