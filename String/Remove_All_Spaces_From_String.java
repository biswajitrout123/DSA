package String;

public class Remove_All_Spaces_From_String {
    public static void main(String[] args) {
        String str = "I love Java";
        int n = str.length();
        for(int i = 0; i < n; i++) {
            if (str.charAt(i) != ' ') {
                System.out.print(str.charAt(i));
            }
        }
    }
}