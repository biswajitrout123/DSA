package Recursion_DSA;

public class PrintSumNaturalNum {
    public static void printSumNatural(int i, int n, int sum) {
        if(i == n){
            sum += i;
            System.out.print(sum);
            return;
        }
        sum += i;
        printSumNatural(i + 1, n, sum);
        
    }

    
    public static void main(String[] args) {
        printSumNatural(1, 5, 0);

    }
}
