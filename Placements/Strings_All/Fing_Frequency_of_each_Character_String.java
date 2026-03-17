package Placements.Strings_All;

public class Fing_Frequency_of_each_Character_String {
    public static void main(String[] args) {
        // Fing_Frequency_of_each_Character_String
        String str = "hello";
        int[] freq = new int[256];
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch]++;
        }
        for(int i = 0; i < 256; i++) {
            if(freq[i] != 0) {
                System.out.println((char)i + " : " + freq[i]);
            }
        }
    }
}