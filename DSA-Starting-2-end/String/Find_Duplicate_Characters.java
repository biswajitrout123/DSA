package String;

public class Find_Duplicate_Characters {
    public static void main(String[] args) {
        String str = "programming";
        int n = str.length();
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    System.out.print(str.charAt(i));
                    break;
                }
            }
        }
    }
}