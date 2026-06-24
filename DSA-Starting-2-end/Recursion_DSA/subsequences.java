package Recursion_DSA;

public class subsequences {
    public static void printSubSequences(String str, int idx, String newString) {
        if(idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        printSubSequences(str, idx+1, newString+currChar);
        printSubSequences(str, idx+1, newString);
    }
    public static void main(String[] args) {
        String str = "abc";
        printSubSequences(str, 0, "");
    }
}
