package Placements.Strings_All;

public class CheckPallindrome {

    public static void main(String[] args) {
        // CHECK FOR PALLINDROME 
        String str = "madam";
        int n = str.length() -1;
        String rev = "";
        for(int i = n; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if(str.equals(rev)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}