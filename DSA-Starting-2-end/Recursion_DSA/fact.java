package Recursion_DSA;

public class fact {
    public static int printFact(int n) {
        
        if(n == 0) {
            return 1;
        }
        if(n == 1){
            return 1; 
        }

        return n * printFact(n - 1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(printFact(n));
    }
}