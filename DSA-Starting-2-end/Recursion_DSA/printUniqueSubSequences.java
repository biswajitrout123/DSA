import java.util.HashSet;

public class printUniqueSubSequences {
    public static void uniqueSubSequences(String str, int idx, String newString, HashSet<String> set) {

        if(idx == str.length()) {
            if(set.contains(newString)){
                return;
            }
            else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);

        uniqueSubSequences(str, idx+1, newString+currChar, set);
        uniqueSubSequences(str, idx+1, newString, set);
    }
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String str = "aaa";
        uniqueSubSequences(str, 0, "", set);
        
    }
    
}
