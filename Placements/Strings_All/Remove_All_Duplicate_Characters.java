package Placements.Strings_All;

public class Remove_All_Duplicate_Characters {
    public static void main(String[] args) {
        String str = "programming";

        boolean[] seen = new boolean[256];
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!seen[ch]) {
                result = result + ch;
                seen[ch] = true;
            }
        }
        System.out.println("After Removing Duplicates: " + result);
    }
}
