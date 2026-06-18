package Recursion_DSA;

public class odd_num_one_to_n {
    public static void printOdd(int idx, int n) {
        if(idx > n) {
            return;
        }
        if(idx % 2 != 0) {
            System.out.println(idx);
        }
        printOdd(idx + 1, n);
    }
    public static void main(String[] args) {
        int n = 10;
        printOdd(0, n);
    }
}
