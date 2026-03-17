package Placements.Strings_All;

public class Find_First_Non_Repeating_Char_String {
    public static void main(String[] args) {
        String str = "swiss";
        int[] freq = new int[256];
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(freq[ch] == 1) {
                System.out.println("First Non-Repeating Character: " + ch);
                break;
            }
        }
    }
}