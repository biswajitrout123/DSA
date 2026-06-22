package Recursion_DSA;

public class printDigits {
    public static void printDigit(int n) {
        if(n == 0) {
            return;
        }

        int digit = n % 10;
        n = n / 10;
        printDigit(n);
        System.out.print(digit + " ");


    }
    public static void main(String[] args) {
        int n = 137;
        printDigit(n);
        
    }
}
