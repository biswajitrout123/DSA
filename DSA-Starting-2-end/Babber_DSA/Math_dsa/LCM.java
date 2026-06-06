package Babber_DSA.Math_dsa;

public class LCM {
     public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        int a = 12;
        int b = 18;

        int gcdValue = gcd(a, b);
        int lcm = (a * b) / gcdValue;

        System.out.println("LCM is: " + lcm);
    }
}
