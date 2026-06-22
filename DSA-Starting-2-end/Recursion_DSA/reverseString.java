package Recursion_DSA;

public class reverseString {
    public static void printReverse(String str, int idx){
        if(idx < 0){
            return;
        }
        System.out.println(str.charAt(idx));
        printReverse(str, idx-1);
    }
    public static void main(String[] args) {
        String str = "Biswajit Rout";
        printReverse(str, str.length()-1);
    }
    
}