package String;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "level";
        int n = str.length();
        String rev = "";
        boolean isPalindrome = true;

        for(int i = n - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (str.equals(rev)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Pallindrome");
        }
    }
}