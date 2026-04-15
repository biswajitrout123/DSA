package Babber_DSA.Math_dsa;

public class prints_digit {
    public static void printDigits(int n) {
    if (n == 0) return;

    printDigits(n / 10);
    System.out.print(n % 10 + " ");
}
    public static void main(String[] args) {
        printDigits(72135);   
    }    
}