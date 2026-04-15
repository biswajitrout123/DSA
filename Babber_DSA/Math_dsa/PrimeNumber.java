package Babber_DSA.Math_dsa;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 29;
        boolean isPrime = true;

        for (int i = 2; i * i <= n; i++) {
             if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not Prime Number");
        }
    }
}