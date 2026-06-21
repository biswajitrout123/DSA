package Recursion_DSA;

public class count_one_to_end {
    public static void printUptoEnd(int idx, int n){
        if(idx > n) {
            return;
        }
        System.out.println(idx);
        printUptoEnd(idx + 1, n);
    }
    public static void main(String[] args) {
        int n = 5;
        printUptoEnd(1, n);
    }
}
