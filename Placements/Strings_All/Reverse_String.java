package Placements.Strings_All;

public class Reverse_String {

    public static void main(String[] args) {
        String str = "hello";
        int n = str.length() - 1;
        for(int i = n; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}