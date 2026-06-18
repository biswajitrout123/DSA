package Recursion_DSA;

public class Power_of_Two {
    public static int printPower(int num, int n) {
        if(n == 0){
            return 1;
        }

        return num * printPower(num, n-1);

    }
    

    public static void main(String[] args) {
        int num = 2;
        int n = 5;

        System.out.println(printPower(num, n));
    }
}