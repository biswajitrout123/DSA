package Babber_DSA.Math_dsa;

public class Sum_Digits {

    public static void main(String[] args) {
        int num = 8888;
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
            

            
        }
        System.out.println(sum);
    

    }
}