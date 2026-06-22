package Recursion_DSA;

public class LowerCase_UpperCase {
    public static void printUpperCase(String str, int idx){
        if(idx == str.length()) {
            return;
        }
        char ch = str.charAt(idx);

        if(ch >= 'a' && ch <= 'z') {
            ch = (char)(ch - ('a' - 'A'));            
        }
        System.out.println(ch);
        printUpperCase(str, idx + 1);    
    }
    public static void main(String[] args) {
        String str = "biswajit Rout";  
        printUpperCase(str, 0);
    }
}