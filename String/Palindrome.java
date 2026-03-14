package String;

public class Palindrome {
    public static void main(String[] args) {

        String s = "A man, a plan, a canal: Panama";

        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");

        int i = 0;
        int j = s.length() - 1;

        boolean isPalindrome = true;

        while(i < j) {
            if(s.charAt(i) != s.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        if(isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}