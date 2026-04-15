package Babber_DSA.Math_dsa;

public class counts_Digits {
    public static void main(String[] args) {
        int n = 909;
        int count = 0;
        while (n > 0) {
            int digit = n % 10;
            count++;
            n = n / 10;
        }
        System.out.println(count);
    }
}
