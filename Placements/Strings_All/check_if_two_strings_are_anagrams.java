package Placements.Strings_All;

public class check_if_two_strings_are_anagrams {
    public static void main(String[] args) {

        String s1 = "heo";
        String s2 = "oeh";

        if(s1.length() != s2.length()) {
            System.out.println("Not Anagram");
        }

        int[] freq = new int[256];
        for(int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
        }

        for(int i = 0 ; i < s2.length(); i++) {
            freq[s2.charAt(i)]--;
        }

        for(int i = 0; i < 256; i++) {
            if(freq[i] != 0) {
                System.out.println("Not Anagram");
                return;
            }
        }
        System.out.println("Anagram");
    }
}
