package Recursion_DSA;
public class print_even_number {
    public static void printEven(int curr, int n) {
        if(curr > n) {
            return;
        }

        if(curr % 2 == 0) {
            System.out.println(curr + " ");
        }
        printEven(curr + 1, n);
    }

    public static void main(String[] args) {
        int n = 10;
        printEven(0, n);
    }
}