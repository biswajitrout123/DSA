package String;

public class ReverseString {

    public static void main(String[] args) {
        String str = "biswajit rout";
        int n = str.length();
        for(int i = n - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}