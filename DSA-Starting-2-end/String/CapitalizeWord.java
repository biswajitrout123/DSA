package String;

public class CapitalizeWord {

    public static void main(String[] args) {
        String str = "biswajit";
        int n = str.length();
        // System.out.println(str.toUpperCase());
        for(int i = 0; i < n; i++) {
            System.out.print(Character.toUpperCase(str.charAt(i)));
        }
    }
}