package Recursion_DSA;

public class PrintNum {
    public static void printFive(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        printFive(n - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        printFive(n);

    }
}
