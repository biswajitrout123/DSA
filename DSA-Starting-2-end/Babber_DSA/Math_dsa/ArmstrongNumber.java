package Babber_DSA.Math_dsa;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 153;
        int original = n;

        int digits = 0;
        int temp = n;

        // count digits
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        int sum = 0;
        temp = n;

        // calculate sum of powers
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        if (sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}
