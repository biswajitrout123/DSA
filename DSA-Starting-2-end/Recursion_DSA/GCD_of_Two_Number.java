package Recursion_DSA;

public class GCD_of_Two_Number {
    public static int printGCD(int num1, int num2) {

        if(num2 == 0) {
            return num1;
        }
        return printGCD(num2, num1 % num2);
    }

    public static void main(String[] args) {
        int num1 = 18;
        int num2 = 48;
        System.out.println(printGCD(num1, num2));
    }
}
