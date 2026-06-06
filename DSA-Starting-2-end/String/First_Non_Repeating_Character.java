package String;

public class First_Non_Repeating_Character {
    public static void main(String[] args) {
        String str = "programming";
        int n = str.length();
        boolean isUnique = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.print(str.charAt(i));
                break;
            }
        }
    }
}