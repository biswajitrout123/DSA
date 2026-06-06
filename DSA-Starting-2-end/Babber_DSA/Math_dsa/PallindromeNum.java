package Babber_DSA.Math_dsa;

public class PallindromeNum {
    public static void main(String[] args) {
        long n = 12321;        
        long original = n;
        long rev = 0;
        
        while (n > 0) {
            long digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;            
        }
        if (original == rev) {
            System.out.println("Palindrome Number");            
        }else{
            System.out.println("Not Pallindrome Number");
        }
    }
}
