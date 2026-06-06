package Placements.Strings_All;

public class Valid_Anagram {
    // Valid Anagram
    /* 
    class Solution {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int n2 = t.length();
        if(n != n2) {
            return false;
        }
        else {
            int count[] = new int[26];
            for(int i = 0; i < n; i++) {
                count[s.charAt(i) - 'a']++;
            }
            for(int i = 0; i < n2; i++) {
                count[t.charAt(i) - 'a']--;
            }
            for(int i = 0; i < count.length; i++) {
                if(count[i] != 0) {
                    return false;
                }
            }
            return true;
        }   
    }

}      
    */
    
}
