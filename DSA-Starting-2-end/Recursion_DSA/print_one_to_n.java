package Recursion_DSA;

public class print_one_to_n {
    public static void printNum(int idx, int n) {
        if(idx > n) {
            return;
        }
        System.out.print(idx + " ");
        printNum(idx + 1, n);
    }
    public static void main(String[] args) {
        int n = 100;
        printNum(0, n);

    }
    
}
