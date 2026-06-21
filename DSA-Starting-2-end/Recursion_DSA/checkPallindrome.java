package Recursion_DSA;

public class checkPallindrome {
    public static void main(String[] args) {
        String str = "naman";
        int j = str.length()-1;
        boolean isPallindrome = true;
        for(int i = 0; i < j; i++) {
            if(str.charAt(i) != str.charAt(j)){
                isPallindrome = false;
                break;
            }
            j--;
        }
        System.out.println(isPallindrome);
        
        
    }
}