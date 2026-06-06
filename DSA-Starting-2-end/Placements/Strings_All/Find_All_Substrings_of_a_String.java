package Placements.Strings_All;

public class Find_All_Substrings_of_a_String {
    public static void main(String[] args) {
        // Find All Substrings of a String
        String str = "abc";
        for(int i = 0; i < str.length(); i++) {
            for(int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
        }
        
    }
}
